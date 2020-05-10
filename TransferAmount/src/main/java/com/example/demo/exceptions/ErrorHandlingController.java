package com.example.demo.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandlingController{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> generalExcaeption(Exception e) throws Exception { 
 
		ExceptionResponse exRes = new ExceptionResponse();
 exRes.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
 exRes.setDescription(e.getMessage());
 System.out.println(e);
  return new ResponseEntity<ExceptionResponse>(exRes,HttpStatus.INTERNAL_SERVER_ERROR);		
		
	}
			
			@ExceptionHandler(CustomException.class)
			public ResponseEntity<ExceptionResponse> specialException(CustomException e) throws Exception { 
		 ExceptionResponse exRes = new ExceptionResponse();
		 exRes.setCode(HttpStatus.BAD_REQUEST.value());
		 exRes.setDescription(e.getMessage());
		 return new ResponseEntity<ExceptionResponse>(exRes,HttpStatus.BAD_REQUEST);
		 

}
		

	
}