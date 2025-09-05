package com;

class Ticket implements Runnable {
	int avl = 2;
//	@Override
//	public synchronized void run() {
//	String name = Thread.currentThread().getName();
//		if(avl>0) {
//			System.out.println(name+" got the ticket");
//			avl = avl-1;
//		}else {
//			System.out.println(name+" Sorry no ticket");
//		}
//	}
	
	@Override
	public  void run() {
	String name = Thread.currentThread().getName();
	System.out.println("Enter in run method "+name);
	
	synchronized (this) {
		if(avl>0) {
			System.out.println(name+" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" Sorry no ticket");
		}
	}
	System.out.println(name+" done booking may be successfully or falure");
	}
}
public class BookingApp {

	public static void main(String[] args) {
		Runnable task1 = new Ticket();		// avl=2
		//Runnable task2 = new Ticket();		// avl=2
		//Runnable task3 = new Ticket();		// avl=2
		//Runnable task4 = new Ticket();		// avl=2
		//Runnable task5 = new Ticket();		// avl=2
		Thread t1 = new Thread(task1, "Ravi");
		Thread t2 = new Thread(task1, "Raju");
		Thread t3 = new Thread(task1, "Ramesh");
		Thread t4 = new Thread(task1, "Ajay");
		Thread t5 = new Thread(task1, "Vikash");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
