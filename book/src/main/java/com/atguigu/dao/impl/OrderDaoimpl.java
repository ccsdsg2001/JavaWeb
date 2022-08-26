package com.atguigu.dao.impl;

import com.atguigu.dao.OrderDao;
import com.atguigu.pojo.Order;

/**
 * @author cc
 * @date 2022年08月26日 16:41
 */
public class OrderDaoimpl extends BaseDao implements OrderDao {

    @Override
    public int saveOrder(Order order) {
        String sql="inter into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";
        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());

    }
}
