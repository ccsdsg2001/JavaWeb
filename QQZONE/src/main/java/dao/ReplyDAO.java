package dao;

import pojo.Reply;
import pojo.Topic;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 22:59
 */
public interface ReplyDAO {
    List<Reply> getReplyList(Topic topic);
    void addReply(Reply reply);
    void delReply(Integer id);

}
