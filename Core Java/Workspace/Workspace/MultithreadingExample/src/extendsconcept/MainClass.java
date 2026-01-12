package extendsconcept;
class Task1 extends Thread {
	
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
	Task1 tt1 = new Task1();
	Task2 tt2 = new Task2();	// indirectly it is a thread reference. 
	
	tt1.start();
	tt2.start();     // it is a method to start the thread 		
					// it is runnable state 

	}

}
