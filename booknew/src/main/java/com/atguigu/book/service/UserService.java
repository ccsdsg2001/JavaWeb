package com.atguigu.book.service;

import com.atguigu.book.pojo.User;

/**
 * @author cc
 * @date 2022年09月09日 22:22
 */
public interface UserService {
    User login(String uname,String pwd);
}
