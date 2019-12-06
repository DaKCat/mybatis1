package com.zking.oa.service.impl;

import com.zking.oa.mapper.BookMapper;
import com.zking.oa.model.Book;
import com.zking.oa.service.IBookService;
import com.zking.oa.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//讲java对象配置到xml上下文中
@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    public BookServiceImpl() {
        super();
    }

    @Override
    public List<Book> list(Book book, PageBean pageBean) {
        List<Book> books = this.bookMapper.list(book);
        return books;
    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int add(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int edit(Book book) {
        return bookMapper.updateByPrimaryKey(book);
    }

    @Override
    public int editPrice(Book book) {
        Book b=new Book();
        b.setBookId(book.getBookId());
        b.setBookPrice(book.getBookPrice());

        return bookMapper.updateByPrimaryKeySelective(b);
    }

    @Override
    public int del(Book book) {
        return bookMapper.deleteByPrimaryKey(book.getBookId());
    }

    @Override
    public int delAll(Book book) {
        return bookMapper.delAll(book);
    }

    @Override
    public Book load(Book book) {
        return bookMapper.selectByPrimaryKey(book.getBookId());
    }
}
