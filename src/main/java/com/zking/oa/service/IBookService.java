package com.zking.oa.service;


import com.zking.oa.model.Book;
import com.zking.oa.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookService {
    int add(Book book);

    int edit(Book book);

    int editPrice(Book book);

    int del(Book book);

    int delAll(Book book);

    @Transactional(readOnly = true)
    Book load(Book book);

    @Transactional(readOnly = true)
    List<Book> list(Book book, PageBean pageBean);

}
