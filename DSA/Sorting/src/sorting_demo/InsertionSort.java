package sorting_demo;

import java.util.Arrays;

public class InsertionSort {
	/*
	 * Insertion sort is comparison based algorithm
	 * In insertion sort it divide elements into two parts sorted  elements and unsorted elements, and 
	 * compare it one by one. Put unsorted elements into sorted elements.
	 * ex. Playing cards
	 * Time Complexity: Best:O(n), Worst:O(n^2)
	 */
	
	public static void main(String[] args) {
		
		int arr[]= {2,1,5,4,8,3};
		System.out.println("Unsorted array: "+ Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			int current=arr[i];
			int j=i-1;
			
			while(j>=0 && current < arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		System.out.println("After the Insertion Sort: "+Arrays.toString(arr));
	}
}
