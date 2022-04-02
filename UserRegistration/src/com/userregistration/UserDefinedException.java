package com.userregistration;
//customize Exception 
public class UserDefinedException extends Exception {
	public String errormessage;
	
	
	//Initializing constructor
	public UserDefinedException(String message) {
		this.errormessage = message;
	}
}