package com.harshit.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.harshit.entity.Customer;
import com.harshit.persistence.CustomerDAOInterface;
import com.harshit.service.CustomerServiceInterface;

public class CustomerServiceImpl implements CustomerServiceInterface{


	@Autowired
	CustomerDAOInterface customerDAO;

	@Override
	public List<Customer> getAllCustomer() throws IOException, SQLException {
		// TODO Auto-generated method stub
		return customerDAO.getAllCustomer();
	}

	@Override
	public boolean insertCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		if(customer.getCustomerId()>0)
			return customerDAO.insertCustomer(customer);
		else return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) throws SQLException {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	public Customer searchCustomerById(int customerId) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return customerDAO.searchCustomerById(customerId);
	}

	@Override
	public boolean isCustomerExists(int customerId) throws SQLException {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerId);
	}

}
