package com.anurag.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.demo.dao.CustomerDao;
import com.anurag.demo.dao.Customer1Dao;
import com.anurag.demo.entity.WalletUser;
import com.anurag.demo.entity.WalletAccount;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao cusDao;
	Customer1Dao cus1Dao;

	@Override
	public WalletUser createAccount(WalletUser acc) {
		// TODO Auto-generated method stub
		return cusDao.save(acc);
		
	}

	@Override
	public void addAmount(Integer cusId, Double balance) {
		// TODO Auto-generated method stub
		Double b= cus1Dao.getAmount(cusId) ;
		Double c= b+balance;
		Integer d= cus1Dao.updateAmount(cusId, c) ;
		 return ;
	}

	@Override
	public Double displayBalance(Integer cusId) {
		// TODO Auto-generated method stub
		 return  cus1Dao.findBalance(cusId);
		
	}

	@SuppressWarnings("unused")
	@Override
	public void transferAmount(Double amount, Integer cusId1, Integer cusId2) {
		// TODO Auto-generated method stub

		Double j= cus1Dao.getAmount1(cusId1) ;
		Double h= j-amount;
		 Integer i= cus1Dao.updateAmount1(cusId1, h) ;
		 
	     Double b= cus1Dao.getAmount2(cusId2) ;
			Double c= b+amount;
			 Integer d= cus1Dao.updateAmount2(cusId2, c) ;
			 
				  return;
	}

	



}