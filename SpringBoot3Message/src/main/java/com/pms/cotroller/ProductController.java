package com.pms.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping("getProduct")
	public String getProduct() {
		return "Getting Product";
	}
	
	@RequestMapping("saveProduct")
	public String saveProduct() {
		return "Saving Product";
	}

}
