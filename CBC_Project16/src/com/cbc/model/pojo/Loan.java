package com.cbc.model.pojo;

import java.util.Date;

public class Loan {

	private int loadId;

	private long accountNumber;
	
	private String customer_name;

	private double loanAmount;

	private int noOfYears;

	private double interestRate;

	private Date sanctionDate;

	private double emiAmount;

	
	
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(long accountNumber, String customer_name, double loanAmount, int noOfYears,
			double interestRate, Date sanctionDate, double emiAmount) {
		super();
		this.loadId = loadId;
		this.accountNumber = accountNumber;
		this.customer_name = customer_name;
		this.loanAmount = loanAmount;
		this.noOfYears = noOfYears;
		this.interestRate = interestRate;
		this.sanctionDate = sanctionDate;
		this.emiAmount = emiAmount;
	}

	public int getLoadId() {
		return loadId;
	}

	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	
	

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Date getSanctionDate() {
		return sanctionDate;
	}

	public void setSanctionDate(Date sanctionDate) {
		this.sanctionDate = sanctionDate;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	@Override
	public String toString() {
		return "Loan [loadId=" + loadId + ", accountNumber=" + accountNumber + ", customer_name=" + customer_name
				+ ", loanAmount=" + loanAmount + ", noOfYears=" + noOfYears + ", interestRate=" + interestRate
				+ ", sanctionDate=" + sanctionDate + ", emiAmount=" + emiAmount + "]";
	}

	
}
