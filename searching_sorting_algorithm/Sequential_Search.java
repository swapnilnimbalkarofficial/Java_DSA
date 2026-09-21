package searching_sorting_algorithm;

import java.util.Arrays;

public class Sequential_Search {
 
	static int sequential_search(int a[], int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = { 33, 11, 99, 88, 55, 66, 77, 22, 44 };
		System.out.println("Initially Array is:" + Arrays.toString(a));
		int result=sequential_search(a, 66);
		System.out.println("Element Found index at: " + result);

	}

}
