package queue;

import java.util.Scanner;

public class PrinterJobMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrinterJobQueue obj = new PrinterJobQueue();

        System.out.print("Enter Queue Size: ");
        int size = sc.nextInt();

        obj.createQueue(size);

        int choice;
        String job;

        do {

            System.out.println("\nPrinterMenu");
            System.out.println("================");
            System.out.println("1. Add Print Job");
            System.out.println("2. Process Print Job");
            System.out.println("3. View Next Print Job");
            System.out.println("4. Display All Printing Jobs");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                if (!obj.isFull()) {
                    System.out.print("Enter Document Name: ");
                    job = sc.nextLine();
                    obj.enqueue(job);
                    System.out.println("Print Job Added");
                } else {
                    System.out.println("Queue Overflow - Printer Queue is Full");
                }

                break;

            case 2:

                if (!obj.isEmpty()) {
                    System.out.println("Processing Print Job: " + obj.dequeue());
                } else {
                    System.out.println("Queue Underflow - No Print Jobs");
                }

                break;

            case 3:

                if (!obj.isEmpty()) {
                    System.out.println("Next Print Job: " + obj.peek());
                } else {
                    System.out.println("Queue Underflow - No Print Jobs");
                }

                break;

            case 4:

                if (!obj.isEmpty()) {
                    obj.display();
                } else {
                    System.out.println("Queue Underflow - No Print Jobs");
                }

                break;

            case 0:

                System.out.println("Exiting...");

                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}