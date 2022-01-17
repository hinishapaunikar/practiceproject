 package sorting;

public class insertionsortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        insertionsortexample obj = new insertionsortexample();
        int[] arr = {64,56,43,12,34,11,89,1};
        obj.printArray(arr);
        obj.insertionsort(arr);
        obj.printArray(arr);
	}

	public void insertionSort(int[] arr) {
		for(int i=1; i < arr.length; i++) {
			
			int pickedElement =  arr[i];
			int j =i-1;
			while (j>=0 && arr[j]> pickedElement) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1 ] = pickedElement;
		}
	}
	
	
	
}
