package com.zking.oa.model;

import com.zking.oa.util.PinYinUtil;
import lombok.ToString;

@ToString
public class Book {
    private Integer bookId;

    private String bookName;

    private Float bookPrice;

    //parameters
    private Float minPrice;

    private Float maxPrice;

    private Integer[] bookIds;

    private String bookBrief;

    private String bookNamepinyin;

    public Book(Integer bookId, String bookName, Float bookPrice, String bookBrief, String bookNamepinyin) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookBrief = bookBrief;
        this.bookNamepinyin = bookNamepinyin;
    }

    public Float getMinPrice() {
        return minPrice;
    }

    public Float getMaxPrice() {
        return maxPrice;
    }

    public Integer[] getBookIds() {
        return bookIds;
    }

    public void setBookIds(Integer[] bookIds) {
        this.bookIds = bookIds;
    }

    public void setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setMinPrice(Float minPrice) {
        this.minPrice = minPrice;
    }

    public Book() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
        this.setBookNamepinyin(PinYinUtil.toPinyin(this.bookName));
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookBrief() {
        return bookBrief;
    }

    public void setBookBrief(String bookBrief) {
        this.bookBrief = bookBrief;
    }

    public String getBookNamepinyin() {
        return bookNamepinyin;
    }

    public void setBookNamepinyin(String bookNamepinyin) {
        this.bookNamepinyin = bookNamepinyin;
    }
}