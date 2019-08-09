package com.sonar.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonar.model.Cart;
import com.sonar.model.Login;
import com.sonar.model.Product;
import com.sonar.service.CartServiceInterface;
import com.sonar.service.LoginServiceInterface;
import com.sonar.service.ProductServiceInterface;

@Controller
public class ProductController {
	
	@Autowired
	ProductServiceInterface productService;
	@Autowired
	CartServiceInterface cartService;
	@Autowired
	LoginServiceInterface loginService;
	
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("addProduct")Product product)
	{
		productService.addProduct(product);
		
		return "addProduct";
	}
	
	
	@RequestMapping("/product")
	public String productCatalog(Model model,HttpSession session)
	{
		model.addAttribute("product", new Product());
	//	model.addAttribute("productList",productService.getAllProduct());
	//  System.out.println(productService.getAllProduct());
		return "product";
	}
	
	@RequestMapping("/add/{productId}/{customerId}")
	public String addProduct(@PathVariable("productId") int productId, @PathVariable("customerId") int customerId,HttpSession session) {
		
		Product product= productService.productId(productId);
		if(cartService.isPresent(customerId, productId))
		{
			Cart cart = cartService.findByCustomerIdAndProductId(customerId, productId);
			cart.setQuantity((cart.getQuantity()+1));
			cartService.addToCart(cart);
		}else {
			Cart cart = new Cart();
			cart.setCustomerId(customerId);
			cart.setProductId(productId);
			cart.setQuantity(1);
			cart.setProductName(product.getProductName());
			cart.setProductprice(product.getProductPrice());
			cartService.addToCart(cart);			
		}	return "product";
	}
	
	
}
