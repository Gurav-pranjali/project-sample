package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="WalletAccount")

public class WalletAccount{

		
	
@Id
@GeneratedValue
@Column(length=10)
private Integer accountId;
@Column(length=10)
private Double accountBalance;
@Column(length=20)
private String status;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="userId")
private WalletUser WalletUser;



@OneToMany (targetEntity=WalletTransactions.class, cascade = CascadeType.ALL)
@JoinColumn	(name = "accountId" , referencedColumnName = "accountId")
private List<WalletTransactions> wallettransactions;




public WalletUser getWalletUser() {
	return WalletUser;
}
public void setWalletUser(WalletUser walletUser) {
	WalletUser = walletUser;
}
public Integer getAccountId() {
	return accountId;
}
public void setAccountId(Integer accountId) {
	this.accountId = accountId;
}
public Double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(Double accountBalance) {
	this.accountBalance = accountBalance;
}

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public List<WalletTransactions> getWallettransactions() {
	return wallettransactions;
}
public void setWallettransactions(List<WalletTransactions> wallettransactions) {
	this.wallettransactions = wallettransactions;
}
@Override
public String toString() {
	return "WalletAccount [accountId=" + accountId + ", account_Balance=" + accountBalance + ", status=" + status
			+ ", WalletUser=" + WalletUser + ", wallettransactions=" + wallettransactions + "]";
}
}