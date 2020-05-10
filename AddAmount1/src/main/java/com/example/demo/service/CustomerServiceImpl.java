package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.dao.Customer1Dao;
import com.example.demo.entity.WalletAccount;
import com.example.demo.exceptions.CustomException;
import com.example.demo.exceptions.ExceptionThrower;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	Customer1Dao cus1Dao;

	/*@Override
	public Double addAmount(Integer cusId, Double balance) {
		// TODO Auto-generated method stub	
		Double b,c;
	 b= cus1Dao.getAmount(cusId) ;
	// if(b==null)
		// throw new RuntimeException("something went wrong");
		/*if(b==null)
		 c= 0+balance;
		else
	 //else {
		 
			 c= b+balance;
		Integer d= cus1Dao.updateAmount(cusId, c) ;//}
		
		 return c;
	}*/
	
	
	@Override
	public Double addAmount(Integer cusId, Double balance) throws CustomException {
		// TODO Auto-generated method stub	
		Double b ,c = null;
				 b= cus1Dao.getAmount(cusId) ;
			 if(b!=null)
			 { c= b+balance;
	Integer d= cus1Dao.updateAmount(cusId, c) ;
	
	 return c;}
	 else
	 {
			ExceptionThrower rt= new ExceptionThrower();
			rt.throwCustomException();
			return c;			
		}	 
	}

	@Override
	public void updateData(Integer cusId) {
		// TODO Auto-generated method stub
	String s="BALANCE PRESENT";		
	 cus1Dao.updateData(s,cusId);
	
	}



}