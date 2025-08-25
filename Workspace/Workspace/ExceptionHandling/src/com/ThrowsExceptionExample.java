package com;

public class ThrowsExceptionExample {

	static void display1() throws Exception{
		//try {
		int result = 100/1;
		//}catch(ArithmeticException e) {}
		System.out.println("display1 method");
	}
	static void display2() throws Exception{
		//try {
		display1();
		//}catch(Exception e) {}
		System.out.println("display2 method");

	}
	public static void main(String[] args) throws Exception{
		//try {
		display2();
		//}catch(Exception e) {}
		System.out.println("main method");

	}

}
