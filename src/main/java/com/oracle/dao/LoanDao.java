package com.oracle.dao;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.oracle.entity.Customer;
import com.oracle.entity.LoanApplication;

public interface LoanDao {
	
	Optional<Customer> findByLoanId(String id);
	Optional<LoanApplication> findByLoanType(String LoanType);
	Optional<LoanApplication> findByDate(Date date);
	 Optional<LoanApplication> searchLoanApplicationByNumber(String loan_application_number);
	 Optional<LoanApplication> searchLoanApplicationByType(String type_code);
	 public LoanApplication applyLoan(LoanApplication la);

}
