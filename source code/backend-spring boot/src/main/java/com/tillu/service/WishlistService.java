package com.tillu.service;


import com.tillu.exception.WishlistNotFoundException;
import com.tillu.model.Product;
import com.tillu.model.User;
import com.tillu.model.Wishlist;

import java.util.Optional;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

