/*
 *	PRN: 260847320048
	Name: Swapnil Sunil Nimbalkar
	Email Id: swapniln1612@gmail.com
 */

package assignment4;

import java.util.Scanner;

public class PersonNames {

    static Scanner sc = new Scanner(System.in);

    static void bubbleSort(String name[]) {

        for (int i = 0; i < name.length - 1; i++) {

            for (int j = 0; j < name.length - i - 1; j++) {

                if (name[j].compareToIgnoreCase(name[j + 1]) > 0) {

                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
    }

    static void display(String name[]) {

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        String name[] = new String[n];

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }

        System.out.println("\nNames before sorting:");
        display(name);

        bubbleSort(name);

        System.out.println("\nNames after sorting:");
        display(name);
    }
}