package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("in run method "+t);
	}
}
class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("in call method "+t);
		return t.getName();
	}
}
public class ExecutorServiceExamples {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		MyCallable c1 = new MyCallable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
		System.out.println("-----------------");
		//ExecutorService es = Executors.newSingleThreadExecutor();   // it create one thread 
		//ExecutorService es = Executors.newFixedThreadPool(3);   // it create one thread 
		ExecutorService es = Executors.newCachedThreadPool();
		//es.submit(r1);
		//es.submit(c1);
		for(int i=1;i<=10;i++) {
			es.submit(c1);
			
		}
	}

}
