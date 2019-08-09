package com.sonar.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonar.model.Cart;
import com.sonar.model.Login;
import com.sonar.service.CartServiceInterface;

@Controller
public class PaymentController {
	
	@Autowired 
	CartServiceInterface cartService;
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//System.out.println("HEllO0");
		Login login = (Login)session.getAttribute("loginDetails");
		//System.err.println(login);
		//System.out.println("HEllO1");
		List<Cart> cart = cartService.findByCustomerId(login.getCustomerId());
		//System.out.println(cart);
		
		cartService.deleteByCustomerId(login.getCustomerId());
		
		//System.out.println("HEllO2");
		
		System.err.println(cartService.findByCustomerId(login.getCustomerId()));
		session.invalidate();
		return "logout";
	}

}
