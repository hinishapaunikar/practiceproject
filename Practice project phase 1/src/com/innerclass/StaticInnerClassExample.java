package com.innerclass;

public class StaticInnerClassExample {
	
      static int data = 10;
      
	   static class Inner{
		   void msg() {
			   System.out.println("Hello! Welcome to java learning");
		   }
	   }
	   
	public static void main(String[] args) {
		
		StaticInnerClassExample.Inner ob = new StaticInnerClassExample.Inner();	
		// TODO Auto-generated method stub 
		ob.msg();
	}

}
