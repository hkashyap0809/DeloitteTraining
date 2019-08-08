package com.harshit.persistence.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import com.harshit.entity.Customer;
import com.harshit.persistence.CustomerDAOInterface;
import com.harshit.utility.ConnectionUtility;

public class CustomerDAOImpl implements CustomerDAOInterface {


//	public static final String GET_ALL_CUSTOMER = "SELECT * FROM CUSTOMER";
//	public static final String INSERT_CUSTOMER ="INSERT INTO CUSTOMER VALUES(?,?,?,?)";
//	public static final String UPDATE_CUSTOMER="UPDATE CUSTOMER SET CUSTOMERNAME=?, CUSTOMERADDRESS=?, BILLAMOUNT=? WHERE CUSTOMERID=?";
//	public static final String DELETE_QUERY="DELETE FROM CUSTOMER WHERE CUSTOMERID=?";
//	public static final String IS_CUSTOMER_EXISTS= "SELECT * FROM CUSTOMER WHERE CUSTOMERID=?";
//	public static final String SEARCH_QUERY = "SELECT * FROM CUSTOMER WHERE CUSTOMERID=?";

	
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
