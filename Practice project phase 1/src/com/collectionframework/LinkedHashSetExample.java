package com.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("rishita");
		set.add("akshay");
		set.add("Nikhil");
		set.add("rishita");
		
for(String elem : set) {
	System.out.println(elem);
}
				

	}

}
