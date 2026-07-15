package sorting_demo;

import java.util.Arrays;

public class BubbleSort {
	/*
	 * bubble sort is the comparison based alogorithm.
	 * it works for the ripitedlly sort adjucent elements if it is wrong.
	 * Bubble sort is not good for huge amount of dataset because its time complexity is in worst case.
	 * Time Complexity: O(n^2)
	 */
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int arr[]= {20,40,90,38,49,26,12,36,78,65,47,32,45,77,62,19,94,22,54};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		printArray(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		
	}

}
