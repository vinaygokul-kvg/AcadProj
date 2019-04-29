package com.cbc.model.pojo;

import java.util.Date;

public class Refund {


	private String customer_name;
	private long account_number;
	private double chargeback_amount;
	private Date refund_date;
	private String reason;
	private String refund_status;
	private double refund_amount;
	private String comments;
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public double getChargeback_amount() {
		return chargeback_amount;
	}
	public void setChargeback_amount(double chargeback_amount) {
		this.chargeback_amount = chargeback_amount;
	}
	public Date getRefund_date() {
		return refund_date;
	}
	public void setRefund_date(Date refund_date) {
		this.refund_date = refund_date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRefund_status() {
		return refund_status;
	}
	public void setRefund_status(String refund_status) {
		this.refund_status = refund_status;
	}
	public double getRefund_amount() {
		return refund_amount;
	}
	public void setRefund_amount(double refund_amount) {
		this.refund_amount = refund_amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Refund(String customer_name, long account_number, double chargeback_amount, Date refund_date, String reason,
			String refund_status, double refund_amount, String comments) {
		super();
		this.customer_name = customer_name;
		this.account_number = account_number;
		this.chargeback_amount = chargeback_amount;
		this.refund_date = refund_date;
		this.reason = reason;
		this.refund_status = refund_status;
		this.refund_amount = refund_amount;
		this.comments = comments;
	}
	public Refund() {
		super();
	}
	
	
}
