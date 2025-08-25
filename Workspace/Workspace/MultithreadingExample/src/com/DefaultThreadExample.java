package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		
		//t.setPriority(10);  // range 1 to 10
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}

}
