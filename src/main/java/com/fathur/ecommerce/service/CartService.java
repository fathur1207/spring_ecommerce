package com.fathur.ecommerce.service;

import java.util.List;

import com.fathur.ecommerce.entity.Cart;

public interface CartService {
	
	public Cart saveCart(Long productId, Long userId);
	
	public List<Cart> getCartsByUser(Long userId);
	
	public Long getCounterCart(Long userId);

	public Boolean updateCartQuantity(String symbol, Long cartId);
	
}
