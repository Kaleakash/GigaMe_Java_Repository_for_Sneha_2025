package com;

class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
	}
}
public class CreatingMultipleThreadWithSingleTask {

	public static void main(String[] args) {
		Runnable task = new Task();
		Thread t = Thread.currentThread();
		System.out.println(t);
		Thread t1 =  new Thread(task);
		Thread t2 =  new Thread(task);
		Thread t3 =  new Thread(task);
		Thread t4 =  new Thread(task);
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		t3.setName("3rd Thread");
		t4.setName("4th Thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
	}

}
