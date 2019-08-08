package com.harshit.client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.harshit.customer.db.CustomerJDBCOperation;
import com.harshit.customer.entities.Customer;
import com.harshit.customer.utils.TakeInput;

public class Client {


	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {


			System.out.println("MENU");
			System.out.println("1 - Print All Records");
			System.out.println("2 - Insert new records");
			System.out.println("3 - Delete a record");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();

			switch(ch)
			{
			case 1: CustomerJDBCOperation.printAllRrcords(); break;
			case 2: {
				Customer customer = TakeInput.takeInput(sc);
				CustomerJDBCOperation.insertRecord(customer); 
			} break;

			case 3:{
				System.out.println("enter the customer ID which you want to delete");
				int customerId = sc.nextInt();
				CustomerJDBCOperation.deleteRecord(customerId);
			}break;
			}

			System.out.println("MORE ? 1-yes /0 - no");
			choice = sc.nextInt();
		}while(choice!=0);
	}

}
