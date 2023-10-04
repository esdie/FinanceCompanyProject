package com.oracle.dao;

import java.util.Optional;

import com.oracle.entity.Customer;

public interface CustomerDao {
	
	Optional<Customer> findById(String id);
	

}
