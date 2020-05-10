package com.capgemini.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capgemini.demo.dao.Customer1Dao;
import com.capgemini.demo.entity.WalletAccount;
import com.capgemini.demo.entity.WalletUser;
import com.capgemini.demo.exceptions.IdNotFoundException;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	Customer1Dao cus1Dao;

	@Override
	public WalletUser validateUser(Integer cusId, String cusPassword) {
		// TODO Auto-generated method stub
		return cus1Dao.LoginDetails(cusId, cusPassword);
		
	

	}

}