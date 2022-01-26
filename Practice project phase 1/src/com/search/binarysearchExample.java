package com.search;

public class binarysearchExample {

    public static void main(String[] arg) {
    	
    	int[] arr = {3,6,9,12,15};
    	binarySearch(arr,0,12,arr.length);
    	
    }
	
    
    static void binarySearch(int[] arr,int start,int key,int end) {
    	
    	int mid = (start+end)/2;
    	while(start<= end) {
    		if(arr[mid]<key) {
    			start= mid+1;
    		}else {
    			 System.out.println("Element is found at index: "+mid);
    		}
    		else {
    			  end = mid-1;
    		}
    	}
    }
    
    
    
    
    
    
    
    
}
