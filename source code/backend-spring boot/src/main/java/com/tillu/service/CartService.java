package com.tillu.service;

import com.tillu.exception.ProductException;
import com.tillu.model.Cart;
import com.tillu.model.CartItem;
import com.tillu.model.Product;
import com.tillu.model.User;
import com.tillu.request.AddItemRequest;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
