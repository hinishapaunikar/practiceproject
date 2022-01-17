package sorting;

public class selectionsortExample {

	public static void main(String[] args) {
	
		selectionSortExample obj = {64,56,34,12,22,11,88,90,1};
		obj.printArray(arr);
		obj.selectionSort(arr);
		obj.printArray(arr);
		
	}
	
	void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	

	void SelectionSortEXample(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			 
			int min_idx = 1;
			for(int j=i+1; j<arr.length; i++) {
				 
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
