package com.cbc.model.bo;

import java.util.List;

import com.cbc.model.pojo.Loan;

public interface LoanDAO {
	
	public int addLoan(Loan l);
	public List<Loan> showAll();
	public Loan showByLoanId(int loanid);
}
