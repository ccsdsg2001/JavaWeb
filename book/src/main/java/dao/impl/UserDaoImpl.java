package dao.impl;

import pojo.User;

/**
 * @author cc
 * @date 2022年08月21日 11:19
 */
public class UserDaoImpl extends BaseDao implements UserDAO{
    @Override
    public User queryUserByUsername(String username) {
        String sql ="Select `id`,`username`,`password`,`email` from t_user where username=?";
        return queryForone(User.class,sql,username);
    }

    @Override
    public User queryByusernameAndPassword(String username, String password) {
        String sql ="Select `id`,`username`,`password`,`email` from t_user where username=? and password=?";
        return queryForone(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
         String sql ="Insert into t_user(`username`,`password`,`email`) values(?,?,?)";

        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
