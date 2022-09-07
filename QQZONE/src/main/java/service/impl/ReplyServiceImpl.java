package service.impl;

import dao.ReplyDAO;
import pojo.HostReply;
import pojo.Reply;
import pojo.Topic;
import service.HostReplyService;
import service.ReplyService;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月07日 20:38
 */
public class ReplyServiceImpl implements ReplyService {
    private ReplyDAO replyDAO;
    private HostReplyService hostReplyService;
    @Override
    public List<Reply> getReplyListByTopicId(Integer topicId) {
        List<Reply> replyList = replyDAO.getReplyList(new Topic(topicId));
        for(int i=0;i<replyList.size();i++){
            Reply reply = replyList.get(i);
            HostReply hostReplyByReplyId = hostReplyService.getHostReplyByReplyId(reply.getId());
            reply.setHostReply(hostReplyByReplyId);
        }
        return replyList;
    }
}
