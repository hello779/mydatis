package com.zking.oa.service.impl.impl;

import com.zking.oa.mapper.NewsMapper;
import com.zking.oa.model.News;
import com.zking.oa.service.impl.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public int grantCategories(News record) {
        return newsMapper.grantCategories(record);
    }

    @Override
    public int removeCategories(News record) {
        return newsMapper.removeCategories(record);
    }
}
