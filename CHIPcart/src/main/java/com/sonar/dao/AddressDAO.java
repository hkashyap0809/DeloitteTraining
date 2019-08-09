package com.sonar.dao;

import org.springframework.data.repository.CrudRepository;

import com.sonar.model.Address;

public interface AddressDAO extends CrudRepository<Address, Integer> {

}
