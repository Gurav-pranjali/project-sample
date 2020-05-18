package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.WalletAccount;
import com.example.demo.entity.WalletTransactions;
import com.example.demo.exceptions.IdNotFoundException;
import com.example.demo.service.CustomerService;



@RestController
@RequestMapping("/Wallet")
@CrossOrigin(origins="http://localhost:4200")
public class EmpRestController {

@Autowired
CustomerService cusService;

@GetMapping("/transactionHistory/{cusId}")
public List<WalletTransactions> TransactionHistory (@PathVariable Integer cusId) throws IdNotFoundException{
	WalletAccount	historydetails =cusService.getTransactionHistory(cusId);
	
	List<WalletTransactions> response = historydetails.getWallettransactions() ; 
	  return	  response;
}
}



			 
