package com.polymorphismExample;

class Calculator{
	   static  int add(int a,int b) {
			return a+b;
		}
		
		static int add(int a, int b,int c) {
			return a+b+c;
		}
public class compiletimepolymorphismExample {
	

public static void main(String[] args) {

	System.out.println(Calculator.add(20, 25));
    System.out.println(Calculator.add(10, 20,30));
}
}
