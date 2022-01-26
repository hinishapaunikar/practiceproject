package com.innerclass;


interface TestAbstractClass{
	abstract void display();
}
public class AnonymousInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAbstractClass obj = new TestAbstractClass();{
		public void display() {
				System.out.println("hello! welcome to java learning");
			}
		}
         obj.display();
	}

}
