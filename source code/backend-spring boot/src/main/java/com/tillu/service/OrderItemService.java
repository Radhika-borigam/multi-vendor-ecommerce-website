package com.tillu.service;


import com.tillu.exception.OrderException;
import com.tillu.model.OrderItem;
import com.tillu.model.Product;

public interface OrderItemService {

	OrderItem getOrderItemById(Long id) throws Exception;
	


}
