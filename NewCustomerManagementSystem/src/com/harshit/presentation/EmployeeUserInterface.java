package com.harshit.presentation;

import java.io.IOException;
import java.sql.SQLException;

public interface EmployeeUserInterface {

	void showEmployeeMenu();
	void performOnEmployeeMenu(int choice) throws SQLException, IOException;

}
