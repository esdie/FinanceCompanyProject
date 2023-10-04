package com.oracle.dao;

import java.sql.Date;
import java.util.Optional;

import com.oracle.entity.Customer;

public interface LoanDao {
	
	Optional<Customer> findByLoanId(String id);
	Optional<Customer> findByLoanType(String LoanType);
	Optional<Customer> findByDate(Date date);


}
