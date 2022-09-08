package service.impl;


import dao.HostReplyDAO;
import pojo.HostReply;
import service.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {

    private HostReplyDAO hostReplyDAO ;

    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return hostReplyDAO.getHostReplyByReplyId(replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        hostReplyDAO.delHostReply(id);
    }
}
