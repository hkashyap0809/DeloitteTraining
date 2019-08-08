package com.harshit.customer.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.harshit.customer.entities.Customer;
import com.harshit.customer.utils.DBUtility;

public class CustomerJDBCOperation {

	public static void printAllRrcords() throws ClassNotFoundException, SQLException, IOException {
	
		Connection connection = DBUtility.getMyConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM CUSTOMER");
		ResultSet resultSet=preparedStatement.executeQuery();


		while(resultSet.next())	{
			System.out.print(resultSet.getInt(1)+"\t\t");
			System.out.print(resultSet.getString(2)+"\t\t");
			System.out.print(resultSet.getString(3)+"\t\t");
			System.out.println(resultSet.getInt(4)+"\t\t");


		}
	}
	public static void insertRecord(Customer customer) throws ClassNotFoundException, SQLException, IOException {
		Connection connection = DBUtility.getMyConnection();

		PreparedStatement preparedStatement = 
				connection.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?)");
		
		preparedStatement.setInt(1, customer.getCustomerId());
		preparedStatement.setString(2, customer.getCustomerName());
		preparedStatement.setString(3, customer.getCustomerAddress());
		preparedStatement.setDouble(4, customer.getBillAmount());

		int noOfRows =preparedStatement.executeUpdate();
		System.out.println(noOfRows+" row added.");

	}
	
	public static void deleteRecord(int customerID) throws ClassNotFoundException, SQLException, IOException
	{
		Connection connection = DBUtility.getMyConnection();

		PreparedStatement preparedStatement = 
				connection.prepareStatement("DELETE FROM CUSTOMER WHERE CUSTOMERID=?");
		preparedStatement.setInt(1, customerID);
		
		int noOfRows = preparedStatement.executeUpdate();
		System.out.println(noOfRows+" rows deleted.");
		

	}
	
	
}
