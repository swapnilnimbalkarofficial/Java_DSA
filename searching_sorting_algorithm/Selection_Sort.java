package searching_sorting_algorithm;

import java.util.Arrays;

public class Selection_Sort {

	static void selection_sort(int a[]) {
		int i, j, min, position;
		for (i = 0; i < a.length - 1; i++) {
			min = a[i];
			position = i;// reference
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i] = min;
		}
	}

	public static void main(String[] args) {
		int a[] = { 33, 11, 99, 88, 55, 66, 77, 22, 44 };
		System.out.println("Initially Array is:" + Arrays.toString(a));
		selection_sort(a);
		System.out.println("After Sort Arrayis:" + Arrays.toString(a));

	}

}
