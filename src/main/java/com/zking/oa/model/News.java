package com.zking.oa.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class News {
    //fields
    private Integer newsId;

    private String title;

    private List<Category> categoryList=new ArrayList<Category>();

    //parameters
//    private Integer categoryId;

    public News(Integer newsId, String title) {
        this.newsId = newsId;
        this.title = title;
    }

    public News() {
        super();
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}