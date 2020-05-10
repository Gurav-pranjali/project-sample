package com.example.demo.service;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Customer1Dao;
//import com.example.demo.dao.Customer2Dao;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired

	Customer1Dao cus1Dao;
//	Customer2Dao cus2Dao;

	//Double j,h,b,c;
	@SuppressWarnings("unused")
	@Override
	public Double transferAmount(Double amount, Integer cusId1, Integer cusId2) {
		Double	j= cus1Dao.getAmount1(cusId1) ;
		Double  h= j-amount;
		 Integer i= cus1Dao.updateAmount1(cusId1, h) ;
		 
		 Double  b= cus1Dao.getAmount2(cusId2) ;
		 Double	 c= b+amount;
			 Integer d= cus1Dao.updateAmount2(cusId2, c) ;	
			 			
				  return c;
				}

/*	@Override
	public void updateData1(Double amount, Integer cusId1, Integer cusId2) {
		// TODO Auto-generated method stub
		WalletAccount po= cus1Dao.fetchData1(cusId1);
		Integer accid1= po.getAccount_Id();
		
		String s1="Amount Credited to UserId: "+cusId2;
		
		cus2Dao.updateacc1(h,amount,s1,accid1);
	
		
	
	}

	@Override
	public void updateData2(Double amount, Integer cusId1,Integer cusId2) {
		// TODO Auto-generated method stub
		WalletAccount op= cus1Dao.fetchData2(cusId2);
		Integer accid2= op.getAccount_Id();
		

		String s2="Amount Debited from UserId: "+cusId2;
		
		cus2Dao.updateacc2(h,amount,s2,accid2);
	}*/

	
	
	
	
	
	
	
	/*@Override
	public void fetchData1(Double amount, Integer cusId1) {
		LocalDateTime datetime1 = LocalDateTime.now();  
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    String formatDateTime = datetime1.format(format);  
		
		WalletAccount wc=cus1Dao.fetchData1(cusId1);
		Integer accountId1=wc.getAccount_Id();
		
		WalletTransactions ww=cus2Dao.find1(accountId1);
		ww.setDescription("Amount "+amount+" credited from account of UserId "+ cusId1);
		ww.setDate_Of_Transaction(datetime1);
		ww.setAmount(amount);
		ww.setAccount_Balance(h);
		
	}
	@Override
	public void fetchData12(Double amount, Integer cusId2) {
		LocalDateTime datetime1 = LocalDateTime.now();  
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    String formatDateTime = datetime1.format(format);  
		
		WalletAccount wc=cus1Dao.fetchData2(cusId2);
		Integer accountId2=wc.getAccount_Id();
		
		WalletTransactions ww=cus2Dao.find2(accountId2);
		ww.setDescription("Amount "+amount+" credited from account of UserId "+ cusId2);
		ww.setDate_Of_Transaction(datetime1);
		ww.setAmount(amount);
		ww.setAccount_Balance(c);
		
	}*/
				  
				

}