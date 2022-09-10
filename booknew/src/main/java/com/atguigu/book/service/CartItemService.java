package com.atguigu.book.service;

import com.atguigu.book.pojo.CartItem;

public interface CartItemService {
    void addCartItem(CartItem cartItem);
    void updateCartItem(CartItem cartItem);
    void addOrUpdateCartItem(CartItem cartItem);
}
