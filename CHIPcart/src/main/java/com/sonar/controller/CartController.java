//package com.sonar.controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.sonar.model.Address;
//
//@Controller
//public class CartController {
//
//	@RequestMapping("/cart/{customerId}")
//	public String proceedToBilling(@PathVariable("customerId")int customerId, Model model){
//		model.addAttribute("billing", new Address());
//		return "address";			
//	}
//
//	@RequestMapping("/goToCart")
//	public String goToCart() {
//
//		return "confirmation";
//
//
//	}
//
//}
