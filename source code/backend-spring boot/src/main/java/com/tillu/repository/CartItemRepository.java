package com.tillu.repository;

import com.tillu.model.Cart;
import com.tillu.model.Product;
import com.tillu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tillu.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
