package com.search;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearchExample {

	public static void main(String[] args) {
	
	int[] arr= {3,6,8,9,12,15};
	
	Scanner sc = new scanner(System.in);
	while(true) {
		 System.out.println("Enter element to search:");
		 int key= sc.nextInt();
		 
		 exponentialSearch(arr,key,arr.length);
	}
		
	

	}

	
	static int exponentialSearch(int[] arr,int n, int x) {
		
		if(arr[0] == x)
		{
		    return 0;	
		}
		int i=1;
		while(i<n && arr[i] <= x) {
			i=i*2;
		}
		
		return Arrays.binarySearch(arr,i/2, Math.min(i, n-1),x);
		
		}
	
	

}
