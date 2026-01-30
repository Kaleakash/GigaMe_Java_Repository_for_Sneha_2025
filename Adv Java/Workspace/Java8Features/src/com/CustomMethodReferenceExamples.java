package com;
interface Hello {
	public String sayHello(String name);
}

class HelloImp1 {		// non static method reference
	public String sayHello(String name) {
		return "Welcome to Method reference non static "+name;
	}
}
class HelloImp2 {		// non static method reference
	public static String sayHello(String name) {
		return "Welcome to Method reference statics "+name;
	}
}
public class CustomMethodReferenceExamples {

	public static void main(String[] args) {
		
		System.out.println("provinding the body for Hello interface using lambda");
	
		Hello h1 = (name)->"Welcome user using lambda "+name;
		System.out.println(h1.sayHello("Ravi"));
		
		HelloImp1 obj1 =new HelloImp1();
		
		Hello h2 = obj1::sayHello;			// non static method reference 
		System.out.println(h2.sayHello("Ram"));
		
		Hello h3 = HelloImp2::sayHello;		// static method reference 
		System.out.println(h3.sayHello("Lokesh"));
		
 	}

}
