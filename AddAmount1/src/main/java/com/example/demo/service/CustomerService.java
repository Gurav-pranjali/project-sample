package com.example.demo.service;

import com.example.demo.entity.WalletAccount;
import com.example.demo.exceptions.CustomException;

public interface CustomerService {

	Double addAmount(Integer cusId, Double balance) throws CustomException;

	void updateData(Integer cusId);
	



}
