package com;
interface Hello {
	void sayHello();
}
class HelloImp implements Hello {
	@Override
	public void sayHello() {
		System.out.println("Hello from HelloImp class");
	}
}
public class SimpleLambdaExpression {
	public static void main(String[] args) {
	// 1st way to provided the body using separate class. 
		Hello h1 = new HelloImp();
		h1.sayHello();
	// 2nd way to provided the body using anonymous class.
		Hello h2 = new Hello() {
			@Override
			public void sayHello() {
				System.out.println("Hello from Anonymous class logic 1");
			}
		};
		h2.sayHello();
		
		Hello h3 = new Hello() {
			@Override
			public void sayHello() {
				System.out.println("Hello from Anonymous class logic 2");
			}
		};
		h3.sayHello();
		// 3rd way to provided the body using lambda expression.
		Hello h4 = ()->System.out.println("Hello from Lambda expression");
		h4.sayHello();
	}

}
