package controller;

import pojo.Topic;
import pojo.UserBasic;
import service.TopicService;
import service.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 23:26
 */
public class UserController {
    private UserBasicService userBasicService;
    private TopicService topicService;

    public String login(String loginId, String pwd, HttpSession session){
        UserBasic userBasic = userBasicService.login(loginId, pwd);
        if(userBasic!=null){
            List<UserBasic> friendList = userBasicService.getFriendList(userBasic);
            List<Topic> topicList = topicService.getTopicList(userBasic);
            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);

            session.setAttribute("userBasic", userBasic);
            return "index";
        }else {
            return "login";
        }
    }
}
