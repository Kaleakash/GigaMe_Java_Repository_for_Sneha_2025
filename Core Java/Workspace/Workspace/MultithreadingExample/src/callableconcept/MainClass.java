package callableconcept;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task1 implements Runnable {
	@Override
	public void run() {										// it doesn't return 
		String name = Thread.currentThread().getName();
		System.out.println("Creating thread using Runnable "+name);
	}
}
class Task2 implements Callable<String>{
	@Override
	public String call() throws Exception {					// it can return 
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println("Creating thread using Callable "+name);
		return name;
	}
}
public class MainClass {
	public static void main(String[] args) throws Exception{
		Runnable r = new Task1();
		Callable<String> c = new Task2();
		
		//ExecutorService es= Executors.newSingleThreadExecutor();		// it create single thread 
		//ExecutorService es= Executors.newFixedThreadPool(3);		// created 3 thread pool and doing 10 task for each submit 
		ExecutorService es= Executors.newCachedThreadPool();		// created only one thread but improve performance. 
		//ExecutorService es= Executors.		// created only one thread but improve performance. 
		
		for(int i=0;i<12;i++) {
		Future ff1 = es.submit(r);			// submit like start which call run methods 
		Future<String> ff2= es.submit(c);			// submit like start which call call methods 
		System.out.println(ff1.get());				// no return because we use run method 
		System.out.println(ff2.get());				// return becuase we use call and it return thread name
		}
		
		es.shutdown();
		System.out.println("main Thread end");
	}

}
