package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.WalletAccount;
import com.example.demo.exceptions.CustomException;
import com.example.demo.service.CustomerServiceImpl;

@SpringBootTest
public class AddAmountApplicationTests {

	@Autowired
	public CustomerServiceImpl service ;
	
	
	
	@Test(expected=NullPointerException.class)
	public void getbalance() throws CustomException {
		
		WalletAccount w=new WalletAccount();
		w.setAccount_Balance(100.0);
		Integer r=115;
		Double balance=100.0;
     	Double b= service.addAmount(r, balance);
		
	assertEquals(balance,b);
	
	}



	public AddAmountApplicationTests() {
		super();
	
	}
	}
