package com.atguigu.headline.service;

import com.atguigu.headline.pojo.NewsUser;

public interface NewsUserService {
    /* 根据用户登录的账号找用户新的方法*/
    NewsUser findByUsername(String username);

    NewsUser findByUid(Integer userId);
    Integer registUser(NewsUser registUser);
}
