package com.zking.oa.service.impl;

import com.zking.oa.mapper.NewsMapper;
import com.zking.oa.model.News;
import com.zking.oa.service.INewsService;
import com.zking.oa.vo.NewsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;
    @Override
    public News loadCasecode(News news) {
        return newsMapper.loadCasecode(news);
    }

    @Override
    public int addCategory(NewsVo newsVo) {
        return newsMapper.addCategory(newsVo);
    }

    @Override
    public int removeCategory(NewsVo newsVo) {
        return newsMapper.removeCategory(newsVo);
    }

    @Override
    public int del(News news) {
        newsMapper.deleteNewsCategory(news);
        return newsMapper.deleteByPrimaryKey(news.getNewsId());
    }
}
