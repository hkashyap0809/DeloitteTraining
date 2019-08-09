package com.sonar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sonar.model.Login;

@Repository
public interface LoginDAO extends CrudRepository<Login, Integer> {

	public Login findByUsername(String username);
}
