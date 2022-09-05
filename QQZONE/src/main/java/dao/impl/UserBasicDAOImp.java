package dao.impl;

import dao.UserBasicDAO;
import myssm.basedao.BaseDAO;
import pojo.UserBasic;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 23:00
 */
public class UserBasicDAOImp extends BaseDAO<UserBasic> implements UserBasicDAO {

    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        return super.load("select * from t_user_basic where loginid = ? and pwd =?", loginId,pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql="SELECT fid as `id` FROM t_friend WHERE uid  = ?";
        return super.executeQuery(sql,userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        return super.load("select * from t_user_basic where id = ?", id);
    }
}
