package com;

public class StringExamples {

	public static void main(String[] args) {
		String str1 = "Welcome to Java Training";
		String str2 = new String("Welcome to Java Training");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.charAt(1));
		System.out.println(str1.substring(6));
		
		String name1= "Ravi";			// it create the memory 
		String name2= "Ravi";			// name1 and name2 refer to same memory string pooling. 
		String name3= new String("Ravi");		// new memory created 
		String name4= new String("Ravi");		// new memory created
		if(name3==name4) {			// check value as well as memory code 
			System.out.println("equal");
		}else {
			System.out.println("no equal");
		}
		System.out.println("=====================");
		if(name3.equalsIgnoreCase(name4)) {			//it check only value doesn't matter same memory or different memory 
			System.out.println("equal");
		}else {
			System.out.println("no equal");
		}
		
	}

}
