package dao.impl;

import pojo.User;

/**
 * @author cc
 * @date 2022年08月21日 11:09
 *
 */
public interface UserDAO {


    /*
     * @Author cc  根据用户名查询用户信息
     * @Description //TODO
     * @Date 11:12 2022/8/21
     * @param null
     * @return null 如果返回null,则表示没有
     **/
    public User queryUserByUsername(String username);
    //根据用户名和密码查询用户信息
    public User queryByusernameAndPassword(String username,String password);

    //保存用户信息
    public int saveUser(User user);
}




