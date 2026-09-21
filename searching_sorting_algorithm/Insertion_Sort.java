package searching_sorting_algorithm;

import java.util.Arrays;

public class Insertion_Sort {
	static void insertion_sort(int a[]) {
		int i, j, element;
		for (i = 0; i < a.length - 1; i++) {
			element = a[i + 1];// new element
			j = i + 1;// from j to Zero
			while (j > 0 && a[j - 1] > element) {// boundary elements ahead of you are larger, then pull it back
				a[j] = a[j - 1];// move back
				j--;
			}
			a[j] = element;
		}
	}
	
	public static void main(String[] args) {
		int a[] = { 33, 11, 99, 88, 55, 66, 77, 22, 44 };
		System.out.println("Initially Array is:" + Arrays.toString(a));
		insertion_sort(a);
		System.out.println("After Sort Arrayis:" + Arrays.toString(a));
	}

}
