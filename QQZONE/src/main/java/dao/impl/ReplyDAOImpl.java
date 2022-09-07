package dao.impl;

import dao.ReplyDAO;
import pojo.Reply;
import pojo.Topic;
import myssm.basedao.*;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月07日 21:04
 */
public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return executeQuery("select * from t_reply where topic= ? ",topic.getId());
    }

    @Override
    public void addReply(Reply reply) {

    }

    @Override
    public void delReply(Integer id) {

    }
}
