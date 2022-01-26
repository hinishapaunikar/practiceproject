package com.multithreading;

class Multi implements Runnable{
	 
	public void run() {
		System.out.println("Thread is running......");
	}
}

public class ImplimentingRunnableInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi runnableObj =  new Multi();
		
		Thread t1  = new Thread(runnableObj);
		Thread t2  = new Thread(runnableObj);
		Thread t3  = new Thread(runnableObj);		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
