package com.sonar.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sonar.model.Address;
import com.sonar.model.Cart;
import com.sonar.model.Login;
import com.sonar.service.AddressServiceInterface;
import com.sonar.service.CartServiceInterface;

@Controller
public class AddressController {

	@Autowired
	AddressServiceInterface addressService;
	
	@Autowired
	CartServiceInterface cartService;
	
	
	@RequestMapping("/billing")
	public String billingDetails(Model model) {
		model.addAttribute("billing", new Address());
		return "address";
	}
	
	@RequestMapping("/billingDetails")
	public String billingDetails(@ModelAttribute("billingDetails")Address address, HttpSession session) {
		Login login = (Login)session.getAttribute("loginDetails");
		System.err.println("boom");
		System.out.println(login);
		List<Cart> cart= cartService.findByCustomerId(login.getCustomerId());
		System.out.println(cart);
		session.setAttribute("cartDetail", cart);
		session.setAttribute("billingDetails", address);
		
		addressService.addAddress(address);
		return "confirmation";
	}

}
