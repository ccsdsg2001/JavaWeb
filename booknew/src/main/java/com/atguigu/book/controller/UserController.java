package com.atguigu.book.controller;

import com.atguigu.book.pojo.User;
import com.atguigu.book.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * @author cc
 * @date 2022年09月09日 22:14
 */
public class UserController {
    private UserService userService;
    public String login(String uname, String pwd, HttpSession session){
        User user = userService.login(uname, pwd);

        if(user!=null){
            session.setAttribute("currUser", user);
            return "redirect:book.do";
        }
        return "user/login";
    }
}
