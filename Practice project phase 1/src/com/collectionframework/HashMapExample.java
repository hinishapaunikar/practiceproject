package com.collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<>();
		
		
		map.put(1, "Amruta");
		map.put(2, "Ravi");
		map.put(3, "shivam");
		
        Set data = map.entrySet();
        Iterator itr = data.iterator();
        
        while(itr.hasNext()){
        	Map.Entry entry = (Map.Entry) itr.next();
        	System.out.println(entry.getKey()+ " " + entry.getValue());
        }
	}

}
