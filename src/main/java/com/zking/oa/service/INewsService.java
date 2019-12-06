package com.zking.oa.service;

import com.zking.oa.model.News;
import com.zking.oa.vo.NewsVo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsService {

    @Transactional(readOnly = true)
    News loadCasecode(News news);

    int addCategory(NewsVo newsVo);

    int removeCategory(NewsVo newsVo);

    int del(News news);

}
