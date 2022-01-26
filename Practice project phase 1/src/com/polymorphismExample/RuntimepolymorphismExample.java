package com.polymorphismExample;
class vehicle{
	void run() {
		System.out.println("vehicle is running");
	}
}

class Bike extends vehicle{
	void run() {
		System.out.println("Bike is running");
	}
}
public class RuntimepolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bike bike = new Bike();
         bike.run();
          
         vehicle v= new vehicle();
         v.run();
	}

}
