package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsType;

import java.util.List;

public interface NewsTypeService {
    /* 查询所有头条类型的方法*/
    List<NewsType> findAll();
}
