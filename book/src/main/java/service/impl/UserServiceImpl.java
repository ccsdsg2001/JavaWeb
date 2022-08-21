package service.impl;

import dao.impl.UserDAO;
import dao.impl.UserDaoImpl;
import pojo.User;

/**
 * @author cc
 * @date 2022年08月21日 11:58
 */
public class UserServiceImpl implements UserService{
    private UserDAO userDAO=new UserDaoImpl();
    @Override
    public void registUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDAO.queryByusernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        if(userDAO.queryUserByUsername(username)==null){
            return false;
        }
        return true;
    }
}
