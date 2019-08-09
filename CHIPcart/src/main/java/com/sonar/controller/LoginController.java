package com.sonar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonar.model.Login;
import com.sonar.model.Product;
import com.sonar.service.LoginServiceInterface;
import com.sonar.service.ProductServiceInterface;

@Controller
public class LoginController {
	@Autowired
	LoginServiceInterface loginService;
	@Autowired
	ProductServiceInterface productService;

	@RequestMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("login", new Login());
		model.addAttribute("signup", new Login());
		return "welcome";
	}

	@RequestMapping("login")
	public String login(@ModelAttribute("login")Login login , HttpSession session, Model model) {
		if(login.getUsername().equals("admin")&&login.getPassword().equals("admin"))
		{
			model.addAttribute("addProduct", new Product());
			return "addProduct";
		}
		Login newLogin = loginService.getDetailsByUsername(login.getUsername());
		
		if(loginService.validUser(login))
		{
			session.setAttribute("loginDetails",newLogin);
			session.setAttribute("productList", productService.getAllProduct());
			return "product";
		}
			
		else
			return "invalidCredentials";
	}

//	@RequestMapping("productCatalog")
//	public String productCatalog(Model model) {
//		model.addAttribute("product", new Product());
//		return "productCatalog";
//	}

	@RequestMapping("signup")
	public String signup(@ModelAttribute("signnup")Login login) {
		loginService.registerUser(login);
		return "successfullyRegistered";
	}


}
