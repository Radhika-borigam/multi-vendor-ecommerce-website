package com.tillu.service;

import com.tillu.exception.CartItemException;
import com.tillu.exception.UserException;
import com.tillu.model.Cart;
import com.tillu.model.CartItem;
import com.tillu.model.Product;


public interface CartItemService {
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
