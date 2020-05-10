package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.WalletAccount;
import com.example.demo.entity.WalletUser;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao cusDao;

	@Override
	public WalletAccount createAccount(WalletAccount acc) {
		// TODO Auto-generated method stub
		return cusDao.save(acc);
	}



}