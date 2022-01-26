package com.sorting;

public class bubblesortExample {

	public static void main(String[] args) {
	 
		bubbleSortExample obj = new bubbleSortExample();
		
		int[] arr = {64,56,45,34,89,93,12};
		obj.printArray(arr);
		obj.bubblesort(arr);
		obj.printArray(arr);
		
	}
    
	void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
	
		}
		
		System.out.println();
	}
	
	void bubblesort(int arr[]) {
		for{int i =0; i<arr.length;i++){
			for(int j = 1; j<arr.length; j++) {
				
				if(arr[j-1]>arr[j]) {
					 int temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
				}
				
			}
		}
	}
	
}