package com.harshit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.harshit.configuration.AppConfiguration;
import com.harshit.entity.Address;
import com.harshit.entity.Customer;

public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Customer customer = context.getBean(Customer.class);
		Address address = context.getBean(Address.class);
		
		customer.setCustomerId(122);
		customer.setCustomerName("Nitin");
		customer.setCustomerAddress("mumbai");
		customer.setBillAmount(98000);
		
		address.setaId(134);
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		
		//customer.setAddress(address); 
		System.out.println(customer);
		context.registerShutdownHook();
		
	}

}
