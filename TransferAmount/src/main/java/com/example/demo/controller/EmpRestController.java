package com.example.demo.controller;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.CustomerService;
import com.example.demo.entity.*;


@RestController
@RequestMapping("/Wallet")
@CrossOrigin("http://localhost:4200")
public class EmpRestController {

	
@Autowired
CustomerService cusService;
@Autowired
RestTemplate rest;

@PutMapping("/transferAmount/{amount}/{cusId1}/{cusId2}")
public String updateEmp(@PathVariable Double amount, @PathVariable Integer cusId1, @PathVariable Integer cusId2) {
  
	LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);  
	System.out.println("gudmrng");
		WalletAccount wa=rest.getForObject("http://localhost:2022/Wallet/displayBalance/"+cusId1,WalletAccount.class);
	System.out.println("gudevng");
	//List<WalletTransactions> ws= new ArrayList();
	WalletTransactions ws=new WalletTransactions();
	WalletTransactions ws1=new WalletTransactions();
	WalletTransactions ws2=new WalletTransactions();
	WalletTransactions ws3=new WalletTransactions();
	ws.setDescription("Amount "+amount+" credited to account of UserId: "+ cusId1);
	ws1.setAccount_Balance(wa.getAccount_Balance());
	ws2.setAmount(amount);
	System.out.println("hii");
	ws3.setDate_Of_Transaction(datetime1);
	System.out.println("hello");
	

	wa.getWallettransactions().set(1, ws1);
	wa.getWallettransactions().set(2, ws2);
	wa.getWallettransactions().set(3, ws3);
	wa.getWallettransactions().set(4, ws);
	
	
	WalletAccount wwa=rest.getForObject("http://localhost:2022/Wallet/displayBalance/"+cusId2,WalletAccount.class);
	//List<WalletTransactions> ws= new ArrayList();
	WalletTransactions wws=new WalletTransactions();
	WalletTransactions wws1=new WalletTransactions();
	WalletTransactions wws2=new WalletTransactions();
	WalletTransactions wws3=new WalletTransactions();
	wws.setDescription("Amount "+amount+" debited from account of UserId: "+ cusId2);
	wws1.setAccount_Balance(wwa.getAccount_Balance());
	wws2.setAmount(amount);
	wws3.setDate_Of_Transaction(datetime1);
	

	wwa.getWallettransactions().set(2, wws);
	wwa.getWallettransactions().set(3, wws3);
	wwa.getWallettransactions().set(4, wws2);
	wwa.getWallettransactions().set(5, wws1);
	
	
	

	
	Double d = cusService.transferAmount(amount, cusId1, cusId2);
       
       //cusService.updateData1(amount, cusId1, cusId2);
       //cusService.updateData2(amount, cusId1, cusId2);      //to enter data in database
       
	return "Amount "+amount+" transfered successfully from account of UserId "+ cusId1+" to "+cusId2;         
  
  //return d;
}
}
