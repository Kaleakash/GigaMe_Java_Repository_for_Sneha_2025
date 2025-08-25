package com;

public class MyException extends Exception{

	public MyException() {
		super();		// by default every sub class constructor 
					// contains super() which help to call super class empty constructor 
	}
	
	public MyException(String msg) {
		super(msg);	// using super we can call parameter constructor of super class 
	}			// to set custom message 
}
