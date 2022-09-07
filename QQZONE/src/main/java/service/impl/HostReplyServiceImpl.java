package service.impl;

import dao.HostReplyDAO;
import pojo.HostReply;
import service.HostReplyService;

/**
 * @author cc
 * @date 2022年09月07日 20:43
 */
public class HostReplyServiceImpl implements HostReplyService {
    private HostReplyDAO hostReplyDAO;
    @Override
    public HostReply getHostReplyByReplyId(Integer id) {
        return hostReplyDAO.getHostReplyByReplyId(id);
    }
}
