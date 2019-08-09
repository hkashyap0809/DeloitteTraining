package com.harshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.harshit.model.Customer;

@Controller
public class CustomerController {
	
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer) {
		ModelAndView view = new ModelAndView();
		
		return view;	
	}
	
	@RequestMapping("/")
	public String Welcome() {
		return "Welcome";
	}
	
	

}
