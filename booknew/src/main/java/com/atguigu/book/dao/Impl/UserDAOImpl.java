package com.atguigu.book.dao.Impl;

import com.atguigu.book.dao.UserDAO;
import com.atguigu.book.pojo.User;
import myssm.basedao.BaseDAO;

/**
 * @author cc
 * @date 2022年09月09日 22:21
 */
public class UserDAOImpl extends BaseDAO<User> implements UserDAO {
    @Override
    public User getUser(String uname, String pwd) {
        return load("select * from t_user where uname like ? and pwd like ?", uname,pwd);
    }
}
