package com.harshit.client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.harshit.presentation.EmployeeUserInterface;
import com.harshit.presentation.imp.EmployeeUserImpl;

public class EmployeeClient {

	public static void main(String[] args) throws SQLException, IOException {
		EmployeeUserInterface employeeUserInterface=new EmployeeUserImpl();
		Scanner sc =new Scanner(System.in);

		while(true){

			employeeUserInterface.showEmployeeMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			employeeUserInterface.performOnEmployeeMenu(choice);
		}

	}
}


