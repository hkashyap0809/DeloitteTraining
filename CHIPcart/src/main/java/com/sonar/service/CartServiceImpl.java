package com.sonar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonar.dao.CartDAO;
import com.sonar.model.Cart;

@Service
public class CartServiceImpl implements CartServiceInterface  {

	@Autowired
	CartDAO cartDAO;

	@Override
	@Transactional
	public void addToCart(Cart cart) {
		cartDAO.save(cart);
	}

	@Override
	public boolean isPresent(int customerId, int productId) {
		Cart cart = cartDAO.findByCustomerIdAndProductId(customerId, productId);
		System.out.println(cart);
		if(cart!=null)
			return true;
		else
			return false;
	}

	@Override
	public Cart findByCustomerIdAndProductId(int customerId, int productId) {
		Cart cart = cartDAO.findByCustomerIdAndProductId(customerId, productId);
		return cart;		
	}

	@Override
	public List<Cart> findByCustomerId(int customerId) {
		List<Cart> cart = cartDAO.findByCustomerId(customerId);
		return cart;
	}

	@Override
	@Transactional
	public void deleteByCustomerId(int customerId) {
		cartDAO.deleteByCustomerId(customerId);	
	}


}
