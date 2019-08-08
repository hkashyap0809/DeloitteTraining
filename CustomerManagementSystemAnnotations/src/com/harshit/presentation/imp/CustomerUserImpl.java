package com.harshit.presentation.imp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.harshit.entity.Customer;
import com.harshit.persistence.CustomerDAOInterface;
import com.harshit.persistence.impl.CustomerDAOImpl;
import com.harshit.presentation.CustomerUserInterface;
import com.harshit.utility.TakeInput;

public class CustomerUserImpl implements CustomerUserInterface {

	@Override
	public void showEmployeeMenu() {
		System.out.println("1. Insert Customer");
		System.out.println("2. Delete Customer By ID");
		System.out.println("3. Update Customer By ID");
		System.out.println("4. Display All Customer");
		System.out.println("5. Search For Customer By ID");
		System.out.println("6. Exit");		
	}

	@Override
	public void performOnEmployeeMenu(int choice) throws SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		CustomerDAOInterface customerDAO;
		switch(choice) {
		case 1:
		{
			customerDAO = new CustomerDAOImpl();
			Customer customer = TakeInput.takeInput(sc);
			boolean result = customerDAO.insertCustomer(customer);
			if(result)
				System.out.println("Customer added.");
		}break;
		case 2:
		{
			System.out.println("Enter the CUSTOMER ID which you want to delete");
			int customerId = sc.nextInt();
			customerDAO = new CustomerDAOImpl();
			boolean result = customerDAO.deleteCustomer(customerId);
			if(result)
				System.out.println(customerId+" deleted.");

		} break;
		case 3:{
			System.out.println("Enter the CUSTOMER ID which you want to delete");
			int customerId = sc.nextInt();
			customerDAO = new CustomerDAOImpl();

			System.out.println("Enter the customer Name");
			String customerName = sc.next();
			System.out.println("Enter the customer Address");
			String customerAddress = sc.next();
			System.out.println("Enter the customer Bill Amount");
			double billAmount = sc.nextInt();


			Customer customer = new Customer(customerId,customerName,customerAddress,billAmount);
			customerDAO.updateCustomer(customer);

		}break;

		case 4:
		{
			customerDAO = new CustomerDAOImpl();
			ArrayList<Customer> customerList = (ArrayList<Customer>) customerDAO.getAllCustomer();
			for(Customer cust : customerList)
				System.out.println(cust);

		}break;
		case 5 :
		{
			System.out.println("Enter the CUSTOMER ID which you want to search");
			int customerId = sc.nextInt();
			customerDAO = new CustomerDAOImpl();

			boolean result = customerDAO.isCustomerExists(customerId);
			if(result) {
				System.out.println("Customer is present");
				Customer customer = customerDAO.searchCustomerById(customerId);
				System.out.println(customer);
			}else {
				System.out.println("Customer is not present");
			}

		}	break;
		case 6 :{
			System.out.println("BYE !");
			System.exit(0);
		} break;
		default:{
			System.out.println("Wrong Input !");
		}
		}
	}

}
