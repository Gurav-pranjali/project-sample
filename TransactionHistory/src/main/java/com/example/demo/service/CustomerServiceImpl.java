package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.WalletAccount;
import com.example.demo.dao.Customer1Dao;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	Customer1Dao cus1Dao;

	@Override
	public WalletAccount getTransactionHistory(Integer cusId) {
		// TODO Auto-generated method stub
		 return  cus1Dao.getdetails(cusId);
		 
		}


}