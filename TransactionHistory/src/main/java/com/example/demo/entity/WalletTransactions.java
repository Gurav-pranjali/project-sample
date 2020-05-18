package com.example.demo.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="WalletTransactions")

public class WalletTransactions {
	
    @Id
    @GeneratedValue
    @Column(length=10)
	private Integer transactionId;
	@Column(length=40)
	private String description;
	@Column(length=15)
	private Date dateOfTransaction;
	@Column(length=10)
	private Double amount;
	@Column(length=10)
	private Double accountBalance;
	


	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDate_Of_Transaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccount_Balance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	
}
