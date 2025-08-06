package sorting_demo;

import java.util.Arrays;

public class SelectionSort {
	/*selection sort is the comparison based alogorithm.
	 * The selection sort is the repitadally sort smallest element from the unsorted array 
	 * and swapping it with the first unsorted element in the array. This process continues till the end of array.
	 * Time Complexity: O(n^2)
	 * It is slower than Quick Sort and Merge Sort
	 * Heap Sort is based on Selection Sort
	 * 
	 */
	
	public static void main(String[] args) {
		
		int arr[]= {2,8,4,9,1,7};
		
		for(int i=0; i<arr.length-1; i++) {
			int smallest=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[smallest]> arr[j]) {
					smallest=j;
				}
			}
			int temp= arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Selection Sort Elements: "+Arrays.toString(arr));

	}

}
