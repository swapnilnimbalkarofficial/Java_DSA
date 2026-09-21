package searching_sorting_algorithm;

import java.util.Arrays;

public class Merge_Sort {
	static void merge_sort(int a[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(a, start, mid);
			merge_sort(a, mid + 1, end);
			merger(a, start, mid, end);
		}
	}

	static void merger(int a[], int start, int mid, int end) {
		int i, j;
		int temp[] = new int[a.length];
		int t_index = start;
		// set
		i = start;
		j = mid + 1;
		t_index = start;
		while (i <= mid && j <= end) {
			if (a[i] < a[j])
				temp[t_index++] = a[i++];
			else
				temp[t_index++] = a[j++];
		}
		while (i <= mid)
			temp[t_index++] = a[i++];
		while (j <= end)
			temp[t_index++] = a[j++];
		for (i = start; i <= end; i++)// copy back to a
			a[i] = temp[i];
	}

	public static void main(String[] args) {
		int a[] = { 33, 11, 99, 88, 55, 66, 77, 22, 44 };
		System.out.println("Initially Array is:" + Arrays.toString(a));
		merge_sort(a, 0, a.length - 1);
		System.out.println("After Sort Arrayis:" + Arrays.toString(a));	}
}
