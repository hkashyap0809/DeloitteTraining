package com.harshit.client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harshit.entity.Customer;
import com.harshit.presentation.CustomerUserInterface;
import com.harshit.presentation.imp.CustomerUserImpl;

public class CustomerClient {

	public static void main(String[] args) throws SQLException, IOException {
		CustomerUserInterface customerUserInterface=new CustomerUserImpl();
		Scanner sc =new Scanner(System.in);

//		while(true){
//
//			customerUserInterface.showEmployeeMenu();
//			System.out.println("Enter Choice : ");
//			int choice=sc.nextInt();
//			customerUserInterface.performOnEmployeeMenu(choice);
//		
		
		Customer customer = new Customer(175, "Kabir", "DDN", 2400);
		
		Configuration configuration = new Configuration().configure();
		System.out.println("configuration");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		System.out.println("session factory");
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Complete");

	}
}


