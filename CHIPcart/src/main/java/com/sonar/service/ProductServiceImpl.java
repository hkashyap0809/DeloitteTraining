package com.sonar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonar.dao.ProductDAO;
import com.sonar.model.Product;

@Service
public class ProductServiceImpl implements ProductServiceInterface{

	@Autowired
	ProductDAO productDAO;

	@Override
	public List<Product> getAllProduct() {
		List<Product> product= (List<Product>) productDAO.findAll();
		return product;
	}

	@Override
	public void addProduct(Product product) {
		productDAO.save(product);		
	}

	@Override
	public Product productId(int id) {
		
		Optional<Product> product=productDAO.findById(id);
		if(product.isPresent())
			return product.get();
		else 
			return null;
	}
	
	
	
	
	
}
