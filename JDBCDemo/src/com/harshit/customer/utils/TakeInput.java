package com.harshit.customer.utils;

import java.util.Scanner;

import com.harshit.customer.entities.Customer;

public class TakeInput {
	
	public static Customer takeInput(Scanner sc)
	{
		System.out.println("Enter the customer ID");
		int customerId = sc.nextInt();
		System.out.println("Enter the customer Name");
		String customerName = sc.next();
		System.out.println("Enter the customer Address");
		String customerAddress = sc.next();
		System.out.println("Enter the customer Bill Amount");
		double billAmount = sc.nextInt();
		
		
		Customer customer = new Customer(customerId,customerName,customerAddress,billAmount);
		return customer;
		
	}

}
