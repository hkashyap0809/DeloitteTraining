package com.sonar.service;

import java.util.List;

import com.sonar.model.Cart;

public interface CartServiceInterface {
	
	public void addToCart(Cart cart);
	public boolean isPresent(int customerId, int productId);
	public Cart findByCustomerIdAndProductId(int customerId, int productId);
	public List<Cart> findByCustomerId(int customerId);
	public void deleteByCustomerId(int customerId);
}
