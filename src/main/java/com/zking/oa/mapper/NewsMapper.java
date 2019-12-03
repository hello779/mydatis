package com.zking.oa.mapper;

import com.zking.oa.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    int grantCategories(News record);

    int removeCategories(News record);
}