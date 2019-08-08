package com.harshit.client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.harshit.presentation.CustomerUserInterface;
import com.harshit.presentation.imp.CustomerUserImpl;

public class CustomerClient {

	public static void main(String[] args) throws SQLException, IOException {
		CustomerUserInterface customerUserInterface=new CustomerUserImpl();
		Scanner sc =new Scanner(System.in);

		while(true){

			customerUserInterface.showEmployeeMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			customerUserInterface.performOnEmployeeMenu(choice);
		}

	}
}


