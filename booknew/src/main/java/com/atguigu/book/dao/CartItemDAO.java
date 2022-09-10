package com.atguigu.book.dao;

import com.atguigu.book.pojo.CartItem;

/**
 * @author cc
 * @date 2022年09月10日 16:00
 */
public interface CartItemDAO {
    void addCartItem(CartItem cartItem);
    void updateCartItem(CartItem cartItem);

}
