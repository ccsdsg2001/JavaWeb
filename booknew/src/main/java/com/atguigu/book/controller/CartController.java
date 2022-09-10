package com.atguigu.book.controller;

import com.atguigu.book.service.CartItemService;

/**
 * @author cc
 *  @date 2022年09月10日 15:59
 */
public class CartController {
    private CartItemService cartItemService;
    public String addCart(Integer bookId){
        cartItemService.addOrUpdateCartItem();

    }
}
