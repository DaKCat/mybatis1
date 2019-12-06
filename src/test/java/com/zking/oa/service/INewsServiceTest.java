package com.zking.oa.service;

import com.zking.oa.model.News;
import com.zking.oa.vo.NewsVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class INewsServiceTest extends BaseTestCase {

    @Autowired
    private INewsService newsService;

    private News news;

    private NewsVo newsVo;

    @Override
    public void before(){
        super.before();
        news=new News();
        newsVo=new NewsVo();
    }

    @Test
    public void loadCasecode() throws Exception {
        news.setNewsId(1);
        News news = newsService.loadCasecode(this.news);
        System.out.println(news);
        System.out.println(news.getCategoryList());
    }

    @Test
    public void addCategory() throws Exception {
        newsVo.setNewsId(1);
        newsVo.setCategoryId(1);

        newsService.addCategory(newsVo);
    }

    @Test
    public void removeCategory() throws Exception {
        newsVo.setNewsId(1);
        newsVo.setCategoryId(1);

        newsService.removeCategory(newsVo);
    }

    @Test
    public void del() throws Exception {
        newsVo.setNewsId(3);

        newsService.del(newsVo);
    }


}