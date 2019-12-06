package com.zking.oa.service;

import com.zking.oa.model.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Locale;

public class IBookServiceTest extends BaseTestCase {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private IBookService iBookService;

    private Book book;

    @Override
    public void before() {
        super.before();
        this.book = new Book();
    }

    @Test
    public void add() throws Exception {
        book.setBookId(3);
        book.setBookName("张11");
        book.setBookBrief("as");
        book.setBookPrice(12f);
        int rowCount = this.iBookService.add(book);
        System.out.println(rowCount);
        System.out.println(book.getBookId());
    }

    @Test
    public void edit() throws Exception {
        book.setBookId(3);
        book.setBookName("zs");
        book.setBookPrice(12f);

        iBookService.edit(book);
    }

    @Test
    public void del() throws Exception {
        book.setBookId(3);
        iBookService.del(book);
    }

    @Test
    public void delAll() throws Exception {
        book.setBookIds(new Integer[]{5, 3});
        iBookService.delAll(book);
    }

    @Test
    public void load() throws Exception {
        book.setBookId(2);
        Book b = iBookService.load(book);
        System.out.println(b);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
        b = iBookService.load(book);
        System.out.println(b);
    }

    @Test
    public void list() throws Exception {
//        book.setBookName("张");
//        book.setMinPrice(12f);
//        book.setMaxPrice(15f);

//        PageBean pageBean=new PageBean();
        pageBean.setPage(1);
        pageBean.setRows(3);

        List<Book> bookList = iBookService.list(book, pageBean);
        System.out.println(bookList.size());
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyy");
        bookList = iBookService.list(book, pageBean);
        System.out.println(bookList.size());
//        for (Book b : bookList) {
//            System.out.println(b);
//        }
    }

    @Test
    public void test(){
        redisTemplate.opsForValue().set("uname","zs");
    }

    @Test
    public void test3(){
        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
    }

}