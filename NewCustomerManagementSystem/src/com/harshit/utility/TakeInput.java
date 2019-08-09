package com.harshit.utility;

import java.util.Scanner;

import com.harshit.entity.Employee;


public class TakeInput {
	
	public static Employee takeInput(Scanner sc)
	{
		System.out.println("Enter the First Name of the Employee");
		String firstName  = sc.next();
		System.out.println("Enter the First Name of the Employee");
		String lastName  = sc.next();
		System.out.println("Enter the Date Of Birth of Employee in DD/MM/YYYY format");
		String dateOfBirth = sc.next();
		System.out.println("Enter the employeeAddress");
		double billAmount = sc.nextInt();
		
		String employeeId = generateEmployeeId(firstName,lastName);
		
		Employee employee;
		return employee;
	}
	
	public static String generateEmployeeId(String firstName, String lastName) {
		String employeeId;
		employeeId = firstName.substring(0,2)+lastName.substring(0,2)+(int)(Math.random()*1000);
		return employeeId;
	}

}
