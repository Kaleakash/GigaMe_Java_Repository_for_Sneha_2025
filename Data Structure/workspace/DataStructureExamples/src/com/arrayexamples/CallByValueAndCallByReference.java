package com.arrayexamples;

public class CallByValueAndCallByReference {

	static void callByValue(int a) {
		System.out.println("Value of a is "+a);
		a=200;
		System.out.println("After change value in method "+a);
	}
	static void callByReference(int num1[]) {
		num1[0]=100;
		System.out.println("in method change the value");
		for(int a:num1) {
			System.out.print(" "+a);
		}
	}
	public static void main(String[] args) {
		int n=10;
		int num[]= {10,20};
		System.out.println("Before call method "+n);
		callByValue(n);	
		for(int a:num) {
			System.out.print(" "+a);
		}
		callByReference(num);
		System.out.println();
		System.out.println("After call method "+n);
		System.out.println("in main method");
		for(int a:num) {
			System.out.print(" "+a);
		}

	}

}
