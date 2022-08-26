package com.atguigu.service;

import com.atguigu.pojo.Cart;

import javax.swing.text.Caret;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
