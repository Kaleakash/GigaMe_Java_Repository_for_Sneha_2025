package com;

@FunctionalInterface
interface Abc {
	void dis1();	// abstract method
	//void dis6();
	default void dis2() {
		System.out.println("This is default method");
	}
	default void dis3() {
		System.out.println("This is default method");
	}
	static void dis4() {
		System.out.println("This is static method");
	}
	static void dis5() {
		System.out.println("This is static method");
	}
}
class Test implements Abc {
	@Override
	public void dis1() {
		System.out.println("This is abstract method");
	}
	@Override
	public void dis2() {
		System.out.println("This is default method overriden by TEst class");
	}

}
public class Java8IntefaceExample {
	public static void main(String[] args) {
		Test t = new Test();
		t.dis1();
		t.dis2();
		t.dis3();
		//t.dis4(); // This will give error
		Abc.dis4();
		Abc.dis5();
	}

}
