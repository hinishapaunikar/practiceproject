package search;

import java.util.Scanner;

public class linearsearchExample {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("Enter element to be searched");
		Scanner scanner = new Scanner(System.in);
		
		int searchvalue = scanner.nextInt();
		
		int result = LinearSearchExample.linearSearch(arr, searchvalue);
		
		if(result== .1) {
			System.out.println("Element not found in array");
		}else {
			 
			System.out.println("Elent found at"+result+" and the search key is "+arr[result]);
			
		}
		
		
		}

	
	  public static int linearSearch(int[] arr, int x) {
		  for(int i=0; i<arr.lenght; i++) {
			  if(arr[i] == x) {
				  return i;
			  }
		  }
		  return-1;
	  }

}
]