package com.harshit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.harshit.entity.Address;
import com.harshit.entity.Customer;

@Configuration
public class AppConfiguration {

	@Bean
	@Scope(value="singleton")
	public Customer getCustomerObject() {
		return new Customer();

	}


	@Bean
	public Address getAddressObject() {
		return new Address();
	}
}

