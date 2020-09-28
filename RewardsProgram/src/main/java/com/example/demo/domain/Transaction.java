package com.example.demo.domain;

public class Transaction {
	
	private Integer transactionId;
	private String customerName;
	private Integer transactionAmount;
	private String transactionMonth;
	
	public Transaction(Integer transactionId, String customerName, Integer transactionAmount, String transactionMonth) {
		this.transactionId=transactionId;
		this.customerName=customerName;
		this.transactionAmount=transactionAmount;
		this.transactionMonth=transactionMonth;
	}
	
	public void setTransactionId(Integer transactionId) {
		this.transactionId=transactionId;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount=transactionAmount;
	}
	public Integer getTransactionAmount() {
		return transactionAmount;
	}
	
	public void setTransactionMonth(String transactionMonth) {
		this.transactionMonth=transactionMonth;
	}
	public String getTransactionMonth() {
		return transactionMonth;
	}
	
}
