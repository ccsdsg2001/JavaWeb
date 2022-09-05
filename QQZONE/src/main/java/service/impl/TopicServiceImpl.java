package service.impl;

import dao.TopicDAO;
import pojo.Topic;
import pojo.UserBasic;
import service.TopicService;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 23:22
 */
public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO=null;
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
