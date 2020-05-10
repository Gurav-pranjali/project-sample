package com.example.demo.controller;
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
import com.example.demo.exceptions.IdNotFoundException;
import com.example.demo.service.CustomerService;



@RestController
@RequestMapping("/Wallet")
@CrossOrigin(origins="http://localhost:4200")
public class EmpRestController {

@Autowired
CustomerService cusService;

/*@GetMapping("/displayBalance/{cusId}")
public Double displayCustomerBalanceById(@PathVariable Integer cusId){
Double	b= cusService.displayBalance(cusId);	
	 System.out.println("Balance of UserId "+cusId+" is: "+b); 
return b;
}
			 
}*/

/*@GetMapping("/displayBalance/{cusId}")
public ResponseEntity<String> displayCustomerBalanceById (@PathVariable Integer cusId) throws IdNotFoundException{
	WalletAccount	b= cusService.displayBalance(cusId);	
	// System.out.println("Balance of UserId "+cusId+" is: "+b); 
	 if(b==null)
		 throw new IdNotFoundException("Customer with UserId "+cusId+" doesn't exist....!");
	 else
	  {
	  ResponseEntity<String>responseEntity = new ResponseEntity<String>("Hello\n" +  b.getWalletUser().getUser_Name()+" "+" \nYour Account balance is "+b.getAccount_Balance(), HttpStatus.OK); 
	  return	  responseEntity;
	  }
	  }
//return b;

@ExceptionHandler(IdNotFoundException.class)
public ResponseEntity<String>IdNotFoundException(IdNotFoundException e){
	return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
	
}
}*/

@GetMapping("/displayBalance/{cusId}")
public WalletAccount displayCustomerBalanceById (@PathVariable Integer cusId) throws IdNotFoundException{
	WalletAccount	b= cusService.displayBalance(cusId);	
	// System.out.println("Balance of UserId "+cusId+" is: "+b); 
	 //if(b==null)
	//	 throw new IdNotFoundException("Customer with UserId "+cusId+" doesn't exist....!");
	 //else
	  //{
	 // ResponseEntity<String>responseEntity = new ResponseEntity<String>("Hello\n" +  b.getWalletUser().getUser_Name()+" "+" \nYour Account balance is "+b.getAccount_Balance(), HttpStatus.OK); 
	  //return	  responseEntity;
	return b;
	  }
	  }



			 
