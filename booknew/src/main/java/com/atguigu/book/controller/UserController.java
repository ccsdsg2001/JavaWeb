package com.atguigu.book.controller;

import com.atguigu.book.pojo.User;
import com.atguigu.book.service.UserService;

/**
 * @author cc
 * @date 2022年09月09日 22:14
 */
public class UserController {
    private UserService userService;
    public String login(String uname,String pwd){
        User user = userService.login(uname, pwd);

        return "index";
    }
}
