package com.harshit.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.harshit.entity.Customer;

public interface CustomerDAOInterface {
	
	public List<Customer> getAllCustomer() throws IOException, SQLException;
	public boolean insertCustomer(Customer customer) throws SQLException;
	public boolean updateCustomer(Customer customer) throws SQLException;
	public boolean deleteCustomer(int customerId) throws SQLException;
	public Customer searchCustomerById(int customerId) throws SQLException, IOException;
	public boolean isCustomerExists(int customerId) throws SQLException;
	

}
