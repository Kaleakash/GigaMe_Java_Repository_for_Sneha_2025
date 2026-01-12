package innerthreadcommunication;
class Operation implements Runnable{
	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(name+" "+i);
				if(i==4 && name.equals("raj")) {
					wait();
				}
				if(i==6 && name.equals("ravi")) {
					notify();
					wait();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}

		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		Operation op = new Operation();
		Thread t1 = new Thread(op, "raj");
		Thread t2 = new Thread(op, "ravi");
		Thread t3 = new Thread(op, "raju");
		t1.start();
		t2.start();
		t3.start();
	}

}
