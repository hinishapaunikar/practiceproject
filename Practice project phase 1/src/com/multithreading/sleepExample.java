package com.multithreading;

class TestSleep implements Runnable{
	 
	public void run() {
		for(int i=1; i<=50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}


public class sleepExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new TestSleep());
		t1.start();
	}

}
