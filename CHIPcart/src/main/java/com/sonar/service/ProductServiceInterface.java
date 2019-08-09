package com.sonar.service;

import java.util.List;

import com.sonar.model.Product;

public interface ProductServiceInterface {
	

	public List<Product> getAllProduct();

	public void addProduct(Product product);
	
	public Product productId(int id);

}
