package com.harshit.persistence.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.harshit.entity.Customer;
import com.harshit.persistence.CustomerDAOInterface;

public class CustomerDAOImpl implements CustomerDAOInterface {
	
	AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session;

	@Override
	public List<Customer> getAllCustomer() throws SQLException{
		//List<Customer> customerList = new ArrayList<>();
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from com.harshit.entity.Customer");
		List<Customer> customerList = query.list();
		return customerList;
			
//		Iterator<Customer> iterator = query.iterate();
//		while(iterator.hasNext()) {
//			Customer customer = iterator.next();
//			customerList.add(customer);
//		}
//		System.out.println(customerList.toString());

		
//		Criteria criteria = session.createCriteria(Customer.class);
//		criteria.add(Restrictions.like("customerAddress", "Allahabad"));
//		return criteria.list();	
//		
	}
	@Override
	public boolean insertCustomer(Customer customer) throws SQLException {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		return true;
	}
	@Override
	public boolean updateCustomer(Customer customer) throws SQLException, IOException {
	
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
	}
	@Override
	public boolean deleteCustomer(int customerId) throws SQLException {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}
	@Override
	public Customer searchCustomerById(int customerId) throws SQLException, IOException {
		session = sessionFactory.openSession();
		Customer customer = (Customer)session.get(Customer.class, customerId);
		session.close();
		return customer;
	}
	@Override
	public boolean isCustomerExists(int customerId) throws SQLException {
		session = sessionFactory.openSession();
		Customer customer = (Customer)session.get(Customer.class, customerId);
		session.close();
		if(customer==null)
			return false;
		else
			return true;
	}

}
