package com.anurag.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anurag.demo.entity.WalletUser;
import com.anurag.demo.service.CustomerService;


@RestController
@RequestMapping("/Wallet")
@CrossOrigin("http://localhost:4200")
public class EmpRestController {

@Autowired
CustomerService cusService;
@PostMapping("/CreateAccount")
public String CreateAccount(@RequestBody WalletUser acc) {
    cusService.createAccount(acc);
	return "Customer Account Created Successfully";
	}

@PutMapping("/addamount/{cusId}/{balance}")
public String addAmount(@PathVariable Integer cusId, Double balance) {
	 cusService.addAmount(cusId, balance);
	 return "Amount added successfully to CustomerId"+ cusId;
			 
}

@GetMapping("/displayBalance/{cusId}")
public String displayCustomerBalanceById(@PathVariable Integer cusId){
Double	b= cusService.displayBalance(cusId);	
	 return "Balance of UserId "+cusId+" is: "+b; 

}

@PutMapping("/transferAmount/{amount}/{from cusId1}/{to cusId2}")
public String updateEmp(@PathVariable Double amount, Integer cusId1, Integer cusId2) {
       cusService.transferAmount(amount, cusId1, cusId2);
       return "Amount " +amount+ "transfered successfully from account" + cusId1+ " to" +cusId2;//
      
}

}
