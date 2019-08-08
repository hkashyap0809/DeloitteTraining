package com.harshit.persistence.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.harshit.entity.Customer;
import com.harshit.persistence.CustomerDAOInterface;
import com.harshit.utility.ConnectionUtility;

public class CustomerDAOImpl implements CustomerDAOInterface {


	public static final String GET_ALL_CUSTOMER = "SELECT * FROM CUSTOMER";
	public static final String INSERT_CUSTOMER ="INSERT INTO CUSTOMER VALUES(?,?,?,?)";
	public static final String UPDATE_CUSTOMER="UPDATE CUSTOMER SET CUSTOMERNAME=?, CUSTOMERADDRESS=?, BILLAMOUNT=? WHERE CUSTOMERID=?";
	public static final String DELETE_QUERY="DELETE FROM CUSTOMER WHERE CUSTOMERID=?";
	public static final String IS_CUSTOMER_EXISTS= "SELECT * FROM CUSTOMER WHERE CUSTOMERID=?";
	public static final String SEARCH_QUERY = "SELECT * FROM CUSTOMER WHERE CUSTOMERID=?";




	@Override
	public List<Customer> getAllCustomer() throws SQLException{

		Connection connection;
		connection = ConnectionUtility.getMyConnection();

		PreparedStatement preparedStatement=connection.prepareStatement(GET_ALL_CUSTOMER);
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Customer> customerList = new ArrayList<>();
		while(resultSet.next()) {

			Customer customer = new Customer();
			customer.setCustomerId(resultSet.getInt("customerId"));
			customer.setCustomerName(resultSet.getString("customerName"));
			customer.setCustomerAddress(resultSet.getString("customerAddress"));
			customer.setBillAmount(resultSet.getDouble("billAmount"));
			customerList.add(customer);
		}
		return customerList;
	}

	@Override
	public boolean insertCustomer(Customer customer) throws SQLException {

		Connection connection=ConnectionUtility.getMyConnection();
		connection.setAutoCommit(false);
		PreparedStatement preparedStatement=connection.prepareStatement(INSERT_CUSTOMER);
		preparedStatement.setInt(1, customer.getCustomerId());
		preparedStatement.setString(2, customer.getCustomerName());
		preparedStatement.setString(3, customer.getCustomerAddress());
		preparedStatement.setDouble(4, customer.getBillAmount());

		int result=0;
		try {
			result = preparedStatement.executeUpdate();
			connection.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			connection.rollback();		}
		connection.close();
		if(result>0)
			return true;
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws SQLException {
		Connection connection = ConnectionUtility.getMyConnection();

		PreparedStatement preparedStatement = 
				connection.prepareStatement(UPDATE_CUSTOMER);
		preparedStatement.setString(1, customer.getCustomerName());
		preparedStatement.setString(2, customer.getCustomerAddress());
		preparedStatement.setDouble(3, customer.getBillAmount());
		preparedStatement.setInt(4, customer.getCustomerId());

		int noOfRows = preparedStatement.executeUpdate();
		if(noOfRows>0)
			return true;
		return false;

	}

	@Override
	public boolean deleteCustomer(int customerId) throws SQLException {
		Connection connection = ConnectionUtility.getMyConnection();

		PreparedStatement preparedStatement = 
				connection.prepareStatement(DELETE_QUERY);
		preparedStatement.setInt(1, customerId);

		int noOfRows = preparedStatement.executeUpdate();
		if(noOfRows>0)
			return true;
		else
			return false;

	}

	@Override
	public Customer searchCustomerById(int customerId) throws SQLException, IOException {
		Customer customer = new Customer();
		Connection connection = ConnectionUtility.getMyConnection();
		PreparedStatement preparedStatement = 
				connection.prepareStatement(SEARCH_QUERY);
		preparedStatement.setInt(1, customerId);
		ResultSet resultSet = preparedStatement.executeQuery();

		resultSet.next();
		customer.setCustomerId(resultSet.getInt(1));
		customer.setCustomerName(resultSet.getString(2));
		customer.setCustomerAddress(resultSet.getString(3));
		customer.setBillAmount(resultSet.getDouble(4));

		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) throws SQLException {
		Connection connection = ConnectionUtility.getMyConnection();
		PreparedStatement preparedStatement = 
				connection.prepareStatement(IS_CUSTOMER_EXISTS);

		preparedStatement.setInt(1, customerId);
		ResultSet resultSet = preparedStatement.executeQuery();
		boolean result=false;
		if(resultSet.next()) {
			result = true;
		}
		return result;
	}

}
