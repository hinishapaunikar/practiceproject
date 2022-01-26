package com.stringdemo;

public class stringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="hello world";
         System.out.println(s1.length());
         
         String sub = new String("welcome");
        System.out.println(sub.substring(2));
        
        String s2 = s1.concat(" Hinisha");
        System.out.println(s2);
         
        s2+= " From mphasis";
        System.out.println(s2);
        
	}

}
