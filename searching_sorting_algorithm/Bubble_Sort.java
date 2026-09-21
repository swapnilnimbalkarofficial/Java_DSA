package searching_sorting_algorithm;

import java.util.Arrays;

public class Bubble_Sort {
	static void bubble_sort(int a[]) {
		int i, j, temp;
		for (i = 0; i < a.length - 1; i++)// n-1:passes
		{
			for (j = 0; j < a.length - 1; j++)
			// j should stop at second last so j+1 can be last
			{
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	static void bubble_sort_improved(int a[]) {
		int i, j, temp;
		for (i = a.length - 1; i > 0; i--)// n-1:passes
		{
			boolean done = true;
			for (j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					done = false;
				}
			}
			if (done == true)
				break;// stop
		}
	}
	
	public static void main(String[] args) {
		int a[] = { 33, 11, 99, 88, 55, 66, 77, 22, 44 };
		System.out.println("Initially Array is:" + Arrays.toString(a));
		//bubble_sort(a);
		bubble_sort_improved(a);
		System.out.println("After Sort Arrayis:" + Arrays.toString(a));
	}
}
