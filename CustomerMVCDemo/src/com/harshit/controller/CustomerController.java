package com.harshit.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.harshit.entity.Customer;
import com.harshit.service.CustomerServiceInterface;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerServiceInterface customerService ;
	
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer) throws SQLException {
		customerService.insertCustomer(customer);
		return new ModelAndView("success","cust",customer);		
	}

	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer) throws SQLException {
		customerService.updateCustomer(customer);
		return new ModelAndView("success","cust",customer);
	}
	@RequestMapping("/searchCustomerById")
	public ModelAndView searchCustomerById() {
		return new ModelAndView("customerSearchById","command", new Customer());
	}
	
	@RequestMapping("/searchCustomerByIdNEW")
	public ModelAndView searchCustomerByIdNEW(Customer customer) throws SQLException, IOException {
		System.out.println(customer);
		Customer newCustomer = customerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView("customerSearchById","command", newCustomer);
	}
	
}
