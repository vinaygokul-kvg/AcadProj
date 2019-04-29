package com.cbc.model.pojo;

import java.math.BigInteger;
import java.util.Date;

public class ChargeBack {
	
	private String customerName;
	
	private long accountNumber;
	
	private double chargebackAmount;
	
	private Date chargebackDate;
	private String reason;

	
	
	public ChargeBack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChargeBack(String customerName, long accountNumber, double chargebackAmount,
			Date chargebackDate, String reason) {
		super();		
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.chargebackAmount = chargebackAmount;
		this.chargebackDate = chargebackDate;
		this.reason = reason;
	}	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getChargebackAmount() {
		return chargebackAmount;
	}

	public void setChargebackAmount(double chargebackAmount) {
		this.chargebackAmount = chargebackAmount;
	}

	public Date getChargebackDate() {
		return chargebackDate;
	}

	public void setChargebackDate(Date chargebackDate) {
		this.chargebackDate = chargebackDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "ChargeBack [customerName=" + customerName + ", accountNumber=" + accountNumber + ", chargebackAmount="
				+ chargebackAmount + ", chargebackDate=" + chargebackDate + ", reason=" + reason + "]";
	}

	

}
