package dao.impl;

import dao.HostReplyDAO;
import myssm.basedao.BaseDAO;
import pojo.HostReply;

/**
 * @author cc
 * @date 2022年09月07日 20:46
 */
public class HostReplyAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return load("SELECT * FROM t_host_reply WHERE reply= ? ",replyId);
    }
}
