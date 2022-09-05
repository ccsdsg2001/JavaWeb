package dao.impl;

import dao.TopicDAO;
import myssm.basedao.BaseDAO;
import pojo.Topic;
import pojo.UserBasic;

import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 23:08
 */
public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("SELECT * FROM t_topic WHERE author = ?",userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void delTopic(Topic topic) {

    }

    @Override
    public Topic getTopic(Integer id) {
        return null;
    }
}
