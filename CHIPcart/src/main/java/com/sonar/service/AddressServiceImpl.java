package com.sonar.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonar.dao.AddressDAO;
import com.sonar.model.Address;
@Service
public class AddressServiceImpl implements AddressServiceInterface {

	@Autowired
	private AddressDAO addressDAO;

	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}


	@Override
	@Transactional
	public void addAddress(Address address) {
		addressDAO.save(address);		
	}

	@Override
	@Transactional
	public List<Address> listAddress() {
		return (List<Address>) this.addressDAO.findAll();
	}


	@Override
	@Transactional
	public void removeAddress(int id) {
		Address address = new Address();
		address.setAddressId(id);
		this.addressDAO.delete(address);

	}

	@Override
	public Address getAddressByCustomerId(Integer id) {
		Optional<Address> address = this.addressDAO.findById(id);
		if(address.isPresent())
		{
			return address.get();
		}
		else
		{
			return null;
		}
	}

}
