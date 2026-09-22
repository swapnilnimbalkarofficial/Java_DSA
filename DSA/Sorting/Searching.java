/*
 *	PRN: 260847320048
	Name: Swapnil Sunil Nimbalkar
	Email Id: swapniln1612@gmail.com
 */

package assignment4;
import java.util.Scanner;

public class Searching {

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

    static void binarySearch() {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                return;
            } else if (key < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Element not found");
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
            System.out.println("2. Linear Search");
            System.out.println("3. Binary Search");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    acceptArray();
                    break;


                case 3:
                    binarySearch();
                    break;

                case 4:
                    displayArray();
                    break;

                case 5:
                    System.out.println("Program terminated");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}