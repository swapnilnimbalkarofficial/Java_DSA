package queue;

import java.util.Scanner;

public class CircularQueueMain {
	public static void main(String[] args) {

		int size, e, choice;

		CircularQueue obj = new CircularQueue();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Queue:");
		size = sc.nextInt();

		obj.createQueue(size);

		do {

			System.out.print("\nQueue Menu");
			System.out.print("\n==========");
			System.out.print("\n1.Enqueue");
			System.out.print("\n2.Dequeue");
			System.out.print("\n3.Print");
			System.out.print("\n0.Exit");
			System.out.print("\n:");

			choice = sc.nextInt();

			switch (choice) {

			case 1:

				if (!obj.isFull()) {

					System.out.print("\nEnter Data:");
					e = sc.nextInt();

					obj.enqueue(choice);

				} else {

					System.out.print("\nQueue Full");
				}

				break;

			case 2:

				if (!obj.isEmpty()) {

					System.out.print("\n" + obj.dequeue() + " Dequeued");

				} else {

					System.out.print("\nQueue Empty");
				}

				break;

			case 3:

				if (!obj.isEmpty()) {

					System.out.print("\nQueue has:\n");

					obj.print_queue();;

				} else {

					System.out.print("\nQueue Empty");
				}

				break;

			case 0:

				System.out.print("\nExiting code......");
				break;

			default:

				System.out.print("\nInvalid choice");
			}

		} while (choice != 0);
	}
}
