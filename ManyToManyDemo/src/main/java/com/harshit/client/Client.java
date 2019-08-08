package com.harshit.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harshit.entity.Address;
import com.harshit.entity.EmployeeDetails;

public class Client {

	public static void main(String[] args) {
	
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Set allAddress = new HashSet();
		
		EmployeeDetails employee1 = new EmployeeDetails(1, "Arun", 95000);
		EmployeeDetails employee2 = new EmployeeDetails(2, "Mohan", 15000);
		EmployeeDetails employee3 = new EmployeeDetails(3, "Amit", 35000);
		
		Address address1 = new Address(1, "Hyd", "Telangana");
		Address address2 = new Address(2,"Bir","Karnataka");
		
		allAddress.add(address1);
		allAddress.add(address2);
		
		employee1.setEmployeeAddress(allAddress);
		employee2.setEmployeeAddress(allAddress);
		
		
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		
		
		System.out.println("your all data recorded successfully !!");
		transaction.commit();
		
		
		sessionFactory.close();
	}
}
