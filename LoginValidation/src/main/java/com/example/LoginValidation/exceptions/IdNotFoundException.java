package com.example.LoginValidation.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class IdNotFoundException extends Exception{


	public IdNotFoundException(String errorMsg) {
		// TODO Auto-generated constructor stub
		super(errorMsg);
	}
	
	
	public IdNotFoundException(String msg,Throwable e){
        super(msg,e);
	}
	

}
