package com.kanghe.boot.dubbo.api.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: W_jun1
 * @Date: 2019/6/3 15:16
 * @Description:
 */
@Getter
@Setter
public class User implements Serializable {

    private String userId;

    private String userName;

}
