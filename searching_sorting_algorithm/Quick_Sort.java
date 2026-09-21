package searching_sorting_algorithm;

import java.util.Arrays;

public class Quick_Sort {

	static void quick_sort(int a[], int start, int end) {
		int i = start;
		int j = end;
		int pivot = start;
		while (i < j) {
			while (a[j] > a[pivot])// should be
				j--;
			if (i < j)// if not greater than swap
			{
				int temp = a[pivot];
				a[pivot] = a[j];
				a[j] = temp;
			}
		}
		if (i < end)// not till end then
			quick_sort(a, i + 1, end);
	}
	
	static void quick_sort_2(int a[], int start, int end) {
		int i = start;
		int j = end;
		int pivot = end;
		while (i < j) {
			while (a[i] < a[pivot])// should be
				j++;
			if (i < j)// if not greater than swap
			{
				int temp = a[pivot];
				a[pivot] = a[i];
				a[i] = temp;
			}
		}
		if (j < start)// not till end then
			quick_sort_2(a, i + 1, j - 1);
	}

	public static void main(String[] args) {
		int a[] = { 33, 11, 99, 88, 55, 66, 77, 22, 44 };
		System.out.println("Initially Array is:" + Arrays.toString(a));
		quick_sort(a, 0, a.length - 1);
		System.out.println("After Sort Arrayis:" + Arrays.toString(a));

	}

}
