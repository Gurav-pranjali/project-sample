package com.anurag.demo.service;



import com.anurag.demo.entity.WalletUser;

public interface CustomerService {

	WalletUser createAccount(WalletUser acc);
	
	void addAmount(Integer cusId, Double balance);

	Double displayBalance(Integer cusId);

	void transferAmount(Double amount, Integer cusId1, Integer cusId2);


}
