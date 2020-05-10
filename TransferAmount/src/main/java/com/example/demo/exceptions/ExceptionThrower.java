package com.example.demo.exceptions;

public class ExceptionThrower {

	public void thowGeneralException() throws Exception{
	
	Exception e = new Exception("Custom Error from Genral Exception");
	throw e;
}

public void throwCustomException() throws CustomException {

	CustomException e= new CustomException();
	e.setCode(400);
	e.setMessage("INVALID ID");
    throw e;
}
}