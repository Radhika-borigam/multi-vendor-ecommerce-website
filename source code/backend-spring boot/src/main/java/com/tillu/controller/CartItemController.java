package com.tillu.controller;

import com.tillu.exception.CartItemException;
import com.tillu.exception.UserException;

import com.tillu.model.CartItem;
import com.tillu.model.User;
import com.tillu.response.ApiResponse;
import com.tillu.service.CartItemService;
import com.tillu.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

	private CartItemService cartItemService;
	private UserService userService;
	
	public CartItemController(CartItemService cartItemService, UserService userService) {
		this.cartItemService=cartItemService;
		this.userService=userService;
	}
	

}
