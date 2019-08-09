package com.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.persistence.ProductDAO;

@RestController
public class ProductController {

	@Autowired(required=true)
	ProductDAO productDAO;

	@RequestMapping("/getProduct")
	public String getProduct() {
		return "Getting Product";
	}

	@RequestMapping("/saveProduct")
	public String saveProduct() {
		Product product = new Product(1, "book", 23, 45);
		productDAO.save(product);
		return "Product Saved successfully";
	}

}

