package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstSpringBootApplication {

	@RequestMapping("/sayMessage")
	public String getMessage() {
		return "Congrats,  your first spring boot application ";
	}
	
	@RequestMapping("byeMessage")
	public String byeMessage()
	{
		return "BYE, ThankYOU";
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

}
