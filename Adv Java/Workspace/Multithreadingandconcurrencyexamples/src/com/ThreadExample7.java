package com;
//class MyTask implements Runnable {
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//}
public class ThreadExample7 {

	public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Daemon running");
            }
        });
       // if thread is daemon parent thread doesn't wait. task will execute in background. 
        daemon.setDaemon(true);// JVM auto gc. 
        daemon.start();


	}

}
