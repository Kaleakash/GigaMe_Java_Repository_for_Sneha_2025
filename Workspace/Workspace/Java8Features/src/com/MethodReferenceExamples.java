package com;

import java.util.Arrays;

interface OperationTask {
	public int add(int x, int y);
}
class OperationTaskImp {
	public static int add(int x, int y) {
		int sum = x+y;
		return sum;
	}
}
public class MethodReferenceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 1st way to provide the body for OperationTask interface 
	// using lambda expression 
	OperationTask task1 = (x,y)->x+y;
	System.out.println("provided the body using lambda expression "+task1.add(10, 20));
	// providing the body using method reference
	OperationTask task2 = OperationTaskImp::add;
	System.out.println("provided the body using method reference "+task2.add(100, 200));
	int num[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Display the value from array using forEach and lambda expression");
		Arrays.stream(num).forEach(e->System.out.println("Value is "+e));
	System.out.println("Display the value from array using forEach and method reference");
		Arrays.stream(num).forEach(System.out::println);
	
	String names[]= {"Amit","Vijay","Rahul","Ajay"};
	System.out.println("using lambda expression to convert into upper case");
	Arrays.stream(names).map(name->name.toUpperCase()).forEach(e->System.out.println(e));
	System.out.println("using method reference to convert into upper case");
	Arrays.stream(names).map(String::toUpperCase).forEach(System.out::println);
	}

}
