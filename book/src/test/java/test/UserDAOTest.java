package test;

import dao.impl.UserDAO;
import dao.impl.UserDaoImpl;
import org.junit.Test;
import pojo.User;

import static org.junit.Assert.*;

public class UserDAOTest {
    UserDAO userDAO=new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        System.out.println(userDAO.queryUserByUsername("admin"));
    }

    @Test
    public void queryByusernameAndPassword() {
        if(userDAO.queryByusernameAndPassword("admin","admin")!=null){
            System.out.println("登录失败");
        }else {
            System.out.println("登录成功");
        }

    }

    @Test
    public void saveUser() {
        System.out.println(userDAO.saveUser(new User(null,"adn","123456","adsad@qq.com")));
    }
}