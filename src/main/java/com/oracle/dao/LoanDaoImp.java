package com.oracle.dao;

import java.sql.Date;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.oracle.entity.Customer;
import com.oracle.entity.LoanApplication;
import com.oracle.repository.DBConnection;
@Component
public class LoanDaoImp implements LoanDao{
	
	DBConnection dbc;

	@Override
	public Optional<Customer> findByLoanId(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<LoanApplication> findByLoanType(String LoanType) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<LoanApplication> findByDate(Date date) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<LoanApplication> searchLoanApplicationByNumber(String loan_application_number) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<LoanApplication> searchLoanApplicationByType(int type_code) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public LoanApplication applyLoan(LoanApplication la) {
		// TODO Auto-generated method stub
		return null;
	}

}
