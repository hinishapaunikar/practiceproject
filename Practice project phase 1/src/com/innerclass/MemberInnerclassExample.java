package com.innerclass;

public class MemberInnerclassExample {
	private String msg = "Hello";
	class Inner{
		void hello(){
			System.out.println(msg+" Welcome to simplilearn");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 MemberInnerclassExample outer= new MemberInnerclassExample();
		 MemberInnerclassExample.Inner innerObj = outer.new Inner();
		 
		 innerObj.hello();
		 
		 
	}

}
