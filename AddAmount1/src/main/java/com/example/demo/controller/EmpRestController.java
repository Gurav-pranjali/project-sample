package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.WalletAccount;
import com.example.demo.exceptions.CustomException;
import com.example.demo.service.CustomerService;



@RestController
@RequestMapping("/Wallet")
@CrossOrigin("http://localhost:4200")
public class EmpRestController {

@Autowired
CustomerService cusService;

@PutMapping("/addAmount/{cusId}/{balance}")
public Double addAmount(@PathVariable Integer cusId, @PathVariable Double balance) throws CustomException {
	
	System.out.println(cusId);
	 Double c=cusService.addAmount(cusId, balance);	 
	 
	 cusService.updateData(cusId);
	 
	 System.out.println("Amount added successfully to UserId: "+ cusId+"  present balance: "+c);
	 
	 return c; 
}


}
