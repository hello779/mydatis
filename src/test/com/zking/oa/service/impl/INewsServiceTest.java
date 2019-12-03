package com.zking.oa.service.impl;

import com.zking.oa.model.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})

public class INewsServiceTest extends BaseTest {
    @Autowired
    private INewsService iNewsService;

    private News news;

    @Override
    public void before(){
        super.before();
        news=new News();
    }


    @Test
    public void grantCategories() {
        news.setNewsId(1);
        news.setCategoryId(3);
        iNewsService.grantCategories(news);
    }

    @Test
    public void removeCategories() {
        news.setNewsId(1);
        news.setCategoryId(3);
        iNewsService.removeCategories(news);

    }

}