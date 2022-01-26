package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	public int a;
	public String c;
	
	public Demo(int a, String c) {
		this.a = a;
		this.c = c;
	}
}


public class SerializationExample {

	public static void mailn(String[] args) {
		Demo demo = new Demo(1,"simplilearn");
		System.out.println("Printing values before Serialization");
		System.out.println(demo.a);
		System.out.println(demo.c);
		System.out.println("==========================");
	
		String filename = "file.ser";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(demo);
		oos.close();
		fos.close();
		
		System.out.println("Serialization is completed");
		
		
	}
	
	
	
	
	
}
