package com.zking.oa.vo;

import com.zking.oa.model.Category;
import com.zking.oa.model.News;
import lombok.Data;

import java.util.List;

@Data
public class NewsVo extends News {
    private Integer categoryId;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public Integer getNewsId() {
        return super.getNewsId();
    }

    @Override
    public void setNewsId(Integer newsId) {
        super.setNewsId(newsId);
    }

    @Override
    public List<Category> getCategoryList() {
        return super.getCategoryList();
    }

    @Override
    public void setCategoryList(List<Category> categoryList) {
        super.setCategoryList(categoryList);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }
}
