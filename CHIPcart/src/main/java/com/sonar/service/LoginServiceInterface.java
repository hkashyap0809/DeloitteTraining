package com.sonar.service;

import com.sonar.model.Login;

public interface LoginServiceInterface {

	public boolean validUser(Login login);
	public void registerUser(Login login);
	public Login getDetailsByUsername(String username);
	
}
