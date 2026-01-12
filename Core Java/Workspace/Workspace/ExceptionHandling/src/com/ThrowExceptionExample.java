package com;

import java.util.Scanner;

public class ThrowExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
		if(age>=21) {
			System.out.println("You can apply for this job");
		}else {
			//throw new Exception();		// generic exception 
			//throw new Exception("age must be >=21");// generic exception with custom message 
			//throw new ArithmeticException("age must be >=21");
			//int result = 100/0;
			//throw new MyException();	// it call empty constructor : user defined exception 
			throw new MyException("age must be >=21");  // user defined exception with custom message
		}
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
