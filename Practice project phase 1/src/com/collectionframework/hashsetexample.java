package com.collectionframework;

import java.util.HashSet;

public class hashsetexample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("rishita");
		set.add("akshay");
		set.add("Nikhil");
		set.add("rishita");
		
for(String elem : set) {
	System.out.println(elem);
}
	}

}
