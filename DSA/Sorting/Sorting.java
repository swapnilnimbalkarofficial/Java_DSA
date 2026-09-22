/*
 *	PRN: 260847320048
	Name: Swapnil Sunil Nimbalkar
	Email Id: swapniln1612@gmail.com
 */

package assignment4;

import java.util.Scanner;

public class Sorting {

    static Scanner sc = new Scanner(System.in);
    static int a[];
    static int n;

    static void acceptArray() {
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        a = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void quickSort(int start, int end) {

        if (start < end) {

            int p = partition(start, end);

            quickSort(start, p - 1);
            quickSort(p + 1, end);
        }
    }

    static int partition(int start, int end) {

        int pivot = a[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {

            if (a[j] < pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;

        return i + 1;
    }

    static void selectionSort() {

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    static void insertionSort() {

        for (int i = 1; i < n; i++) {

            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }

    static void mergeSort(int start, int end) {

        if (start < end) {

            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            merge(start, mid, end);
        }
    }

    static void merge(int start, int mid, int end) {

        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = a[j];
            j++;
            k++;
        }

        for (i = start, k = 0; i <= end; i++, k++) {
            a[i] = temp[k];
        }
    }

    static void bubbleSort() {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void displayArray() {

        if (a == null) {
            System.out.println("Array not accepted");
            return;
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n1. Accept Array Elements");
            System.out.println("2. Quick Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Insertion Sort");
            System.out.println("5. Merge Sort");
            System.out.println("6. Bubble Sort");
            System.out.println("7. Display Array");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    acceptArray();
                    break;

                case 2:
                    quickSort(0, n - 1);
                    System.out.println("Array sorted using Quick Sort");
                    break;

                case 3:
                    selectionSort();
                    System.out.println("Array sorted using Selection Sort");
                    break;

                case 4:
                    insertionSort();
                    System.out.println("Array sorted using Insertion Sort");
                    break;

                case 5:
                    mergeSort(0, n - 1);
                    System.out.println("Array sorted using Merge Sort");
                    break;

                case 6:
                    bubbleSort();
                    System.out.println("Array sorted using Bubble Sort");
                    break;

                case 7:
                    displayArray();
                    break;

                case 8:
                    System.out.println("Program terminated");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}