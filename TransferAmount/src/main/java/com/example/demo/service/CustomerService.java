package com.example.demo.service;

import com.example.demo.entity.WalletTransactions;

public interface CustomerService {



	Double transferAmount(Double amount, Integer cusId1, Integer cusId2);

//	void updateData1(Double amount, Integer cusId1, Integer cusId2);

	//void updateData2(Double amount, Integer cusId1,Integer cusId2);

}
