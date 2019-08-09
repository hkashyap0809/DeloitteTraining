package com.harshit.presentation.imp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.harshit.entity.Employee;
import com.harshit.persistence.EmployeeDAOInterface;
import com.harshit.persistence.impl.EmployeeDAOImpl;
import com.harshit.presentation.EmployeeUserInterface;
import com.harshit.utility.TakeInput;

public class EmployeeUserImpl implements EmployeeUserInterface {

	@Override
	public void showEmployeeMenu() {
		System.out.println("1. Insert Customer");
//		System.out.println("2. Delete Customer By ID");
//		System.out.println("3. Update Customer By ID");
//		System.out.println("4. Display All Customer");
//		System.out.println("5. Search For Customer By ID");
		System.out.println("6. Exit");		
	}

	@Override
	public void performOnEmployeeMenu(int choice) throws SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		EmployeeDAOInterface employeeDAO;
		
		switch(choice) {
		case 1:
		{
			employeeDAO = new EmployeeDAOImpl();
			System.out.println("insert");
			Employee employee = TakeInput.takeInput(sc);
			System.out.println("inserting employee");
			boolean result = employeeDAO.insertEmployee(employee);
			if(result)
				System.out.println("Employee added.");
			else
				System.out.println("Employee Not Added");
		}break;
//		
//		case 2:
//		{
//			System.out.println("Enter the CUSTOMER ID which you want to delete");
//			int customerId = sc.nextInt();
//			customerDAO = new EmployeeDAOImpl();
//			boolean result = customerDAO.deleteCustomer(customerId);
//			if(result)
//				System.out.println(customerId+" deleted.");
//
//		} break;
//		case 3:{
//			System.out.println("Enter the CUSTOMER ID which you want to delete");
//			int customerId = sc.nextInt();
//			customerDAO = new EmployeeDAOImpl();
//
//			System.out.println("Enter the customer Name");
//			String customerName = sc.next();
//			System.out.println("Enter the customer Address");
//			String customerAddress = sc.next();
//			System.out.println("Enter the customer Bill Amount");
//			double billAmount = sc.nextInt();
//
//
//			Customer customer = new Customer(customerId,customerName,customerAddress,billAmount);
//			customerDAO.updateCustomer(customer);
//
//		}break;
//
//		case 4:
//		{
//			customerDAO = new EmployeeDAOImpl();
//			ArrayList<Customer> customerList = (ArrayList<Customer>) customerDAO.getAllCustomer();
//			for(Customer cust : customerList)
//				System.out.println(cust);
//
//		}break;
//		case 5 :
//		{
//			System.out.println("Enter the CUSTOMER ID which you want to search");
//			int customerId = sc.nextInt();
//			customerDAO = new EmployeeDAOImpl();
//
//			boolean result = customerDAO.isCustomerExists(customerId);
//			if(result) {
//				System.out.println("Customer is present");
//				Customer customer = customerDAO.searchCustomerById(customerId);
//				System.out.println(customer);
//			}else {
//				System.out.println("Customer is not present");
//			}
//
//		}	break;
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
