package com.cbc.model.pojo;

import java.util.Date;

public class Emi {
	private int loanId;	
	private Date dueDate;	
	private Date paidDate;
	public Emi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emi(int loanId, Date dueDate, Date paidDate) {
		super();
		this.loanId = loanId;
		this.dueDate = dueDate;
		this.paidDate = paidDate;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	@Override
	public String toString() {
		return "Emi [loanId=" + loanId + ", dueDate=" + dueDate + ", paidDate=" + paidDate + "]";
	}

}
