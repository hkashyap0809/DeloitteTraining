package com.demo.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.demo.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{
	
	

}
