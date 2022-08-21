package test;

import org.junit.Test;
import pojo.User;
import service.impl.UserService;
import service.impl.UserServiceImpl;

import static org.junit.Assert.*;

public class UserServiceTest {
    UserService userService=new UserServiceImpl();
    @Test
    public void registUser() {
        userService.registUser(new User(null,"ccc123","3123213","231312@qq,com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"ccc123","3123213",null)));
    }

    @Test
    public void existUsername() {
        if(userService.existUsername("ccc123")){
            System.out.println("用户名已存在");
        }else {
            System.out.println("用户名可用");
        }
    }
}