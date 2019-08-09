package com.sonar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sonar.model.Cart;

@Repository
public interface CartDAO extends CrudRepository<Cart, Integer> {
	
	public Cart findByCustomerIdAndProductId(int customerId, int productId);
	public List<Cart> findByCustomerId(int customerId);
	public void deleteByCustomerId(int customerId);

}
