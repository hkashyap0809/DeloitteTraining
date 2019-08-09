package com.sonar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonar.dao.LoginDAO;
import com.sonar.model.Login;

@Service
public class LoginServiceImpl implements LoginServiceInterface{

	@Autowired
	LoginDAO loginDAO;

	@Override
	public boolean validUser(Login login) {
		Login correct = loginDAO.findByUsername(login.getUsername());
		if(correct.getPassword().equals(login.getPassword()))
			return true;
		else
			return false;
	}

	@Override
	public void registerUser(Login login) {
		loginDAO.save(login);
	}

	@Override
	public Login getDetailsByUsername(String username) {
		return loginDAO.findByUsername(username);

	}


}
