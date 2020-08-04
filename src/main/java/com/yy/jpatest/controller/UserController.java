package com.yy.jpatest.controller;

import com.yy.jpatest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yuyue
 * @create 2020/8/3 12:37
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/put")
    public String updateUserStatus(){
        userService.updateStatusByExpirationDate();
        return "更新成功";
    }

}
