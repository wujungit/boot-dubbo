package com.kanghe.boot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kanghe.boot.dubbo.api.entity.User;
import com.kanghe.boot.dubbo.api.service.IUserService;

/**
 * @Author: W_jun1
 * @Date: 2019/6/3 15:21
 * @Description:
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {
    @Override
    public User getUser() {
        User user = new User();
        user.setUserId("123456");
        user.setUserName("吴俊");
        return user;
    }
}
