package controller;

import pojo.Reply;
import pojo.Topic;
import service.ReplyService;
import service.TopicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月07日 20:26
 */
public class TopicController {
    private TopicService topicService;
    private ReplyService replyService;
    public String topicDetail(Integer id, HttpSession session){
        Topic topic = topicService.getTopicById(id);

        session.setAttribute("topic", topic);
        return "frames/detail";

    }
}
