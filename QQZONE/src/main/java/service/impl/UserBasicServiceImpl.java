package service.impl;

import dao.UserBasicDAO;
import pojo.UserBasic;
import service.UserBasicService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 23:14
 */
public class UserBasicServiceImpl implements UserBasicService {

    private UserBasicDAO userBasicDAO=null;
    @Override
    public UserBasic login(String loginId, String pwd) {
        UserBasic userBasic=userBasicDAO.getUserBasic(loginId,pwd);
        return userBasic;
    }

    @Override
    public List<UserBasic> getFriendList(UserBasic userBasic) {
        List<UserBasic> userBasicList = userBasicDAO.getUserBasicList(userBasic);
        List<UserBasic> friendList = new ArrayList<>(userBasicList.size());
        for(int i=0;i<userBasicList.size();i++){
            UserBasic friend = userBasicList.get(i);
            friend = userBasicDAO.getUserBasicById(friend.getId());
            friendList.add(friend);
        }
        return friendList;
    }
}
