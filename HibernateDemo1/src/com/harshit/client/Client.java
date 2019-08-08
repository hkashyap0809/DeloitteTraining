package com.harshit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harshit.entity.Customer;

public class Client {

	public static void main(String[] args) {
	
		Customer customer = new Customer(6067, "Chirag", "BHATINDA", 9800);
		
		//hibernate.cfg.xml and creates db connection
		Configuration configuration = new Configuration().configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("DATA saved");
		
	}
}
