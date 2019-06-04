package com.kanghe.boot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kanghe.boot.dubbo.api.entity.User;
import com.kanghe.boot.dubbo.api.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: W_jun1
 * @Date: 2019/6/3 15:23
 * @Description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Reference(version = "1.0.0")
    private IUserService userService;

    @GetMapping(value = "/getUser")
    public User getUser() {
        return userService.getUser();
    }

}
