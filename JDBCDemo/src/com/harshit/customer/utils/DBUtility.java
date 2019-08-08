package com.harshit.customer.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {

	public static Connection getMyConnection() throws IOException
	{
		Connection connection = null;
		FileReader reader;
		try {
			reader = new FileReader("myproperties.properties");
			Properties properties = new Properties();
			properties.load(reader);
			Class.forName("com.mysql.jdbc.Driver");
			
//			String url =properties.getProperty("url");
//			String username = properties.getProperty("username");
//			String password = properties.getProperty("password");
//			System.out.println(password);

			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","darknight0809");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;


	}
}
