package com.exception;

public class exceptionhandling {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		int c = a/b;
		
		try {
			   int c = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Internal errror occured");
		
		}catch(Exception e) {
            System.out.print("Internal error occured");
	}

		System.out.println("This is end of statement");
}
}