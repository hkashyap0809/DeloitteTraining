package com.harshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/apple")
	public ModelAndView takeMeToApple() {
		ModelAndView view = new ModelAndView();
		view.addObject("message","Hello,Today is thursday.");
		view.setViewName("sayHello");
		return view;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
