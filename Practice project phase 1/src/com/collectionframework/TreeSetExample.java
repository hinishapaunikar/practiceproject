package com.collectionframework;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
	
		TreeSet<String> set = new TreeSet<>();
		set.add("rishita");
		set.add("akshay");
		set.add("Nikhil");
		set.add("rishita");
		//set.add(null); it gives null exception
for(String elem : set) {
	System.out.println(elem);
}

	}

}
