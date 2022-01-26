package com.innerclass;

public class LocalInnerclass {
	private String msg = "hello! welcome to java learning";
	
	
	
	void display() {
		class Inner {
			void msg(){
				System.out.println(msg);
			}
		}
		Inner innerObj = new Inner();
		innerObj.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalInnerclass demo = new LocalInnerclass();
		demo.display();
	}

}
