package implementsconcept;
class Task1 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i = "+i);
		}
	}
}
class Task2 extends Thread {
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j = "+j);
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		Runnable tt1 = new Task1();
		Runnable tt2 = new Task2();			
		
		Thread t1 = new Thread(tt1);			// t1 is thread class reference 
		Thread t2 = new Thread(tt2);
		
		t1.start();
		t2.start();     // runnable state 
		//t1.start();
	}

}
