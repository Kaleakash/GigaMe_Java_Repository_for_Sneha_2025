package com;
class Car implements Runnable {
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	//System.out.println(name);
		for(int i=0;i<10;i++) {
			System.out.println(name+" moving with speed as "+(40+i)+"km/hr");
			try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class GamingApp {

	public static void main(String[] args) throws Exception{
		Car car = new Car();
		
		Thread t1 = new Thread(car, "Car 1");
		Thread t2 = new Thread(car, "Car 2");
		Thread t3 = new Thread(car, "Car 3");
		Thread t4 = new Thread(car, "Car 4");
		System.out.println("Game Start");
		Thread.sleep(1000);
		System.out.println("1....");
		Thread.sleep(1000);
		System.out.println("2....");
		Thread.sleep(1000);
		System.out.println("3....");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println("Game End or Finish");
	}

}
