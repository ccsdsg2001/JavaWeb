package service.impl;

import dao.TopicDAO;
import pojo.Reply;
import pojo.Topic;
import pojo.UserBasic;
import service.ReplyService;
import service.TopicService;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 23:22
 */
public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO=null;
    private ReplyService replyService;
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }

    @Override
    public Topic getTopicById(Integer id) {
        Topic topic = topicDAO.getTopic(id);
        List<Reply> replyListByTopicId = replyService.getReplyListByTopicId(topic.getId());
        topic.setReplyList(replyListByTopicId);
        return topic;
    }
}
