package com.zking.oa.service.impl;

import com.zking.oa.model.News;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsService {

    int grantCategories(News record);

    int removeCategories(News record);
}
