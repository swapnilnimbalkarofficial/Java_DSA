package queue;

import java.util.Scanner;

public class Queue_Linear_Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Queue_Linear obj=new Queue_Linear();
		
		System.out.println("Enter size of Queue: ");
		int size=sc.nextInt();
		
		obj.createQueue(size);
		
		int choice=0,e;
		
		do {
			System.out.print("\n\nQueue Menu:");
            System.out.print("\n-----------");
            System.out.print("\n1. Enqueue");
            System.out.print("\n2. Dequeue");
            System.out.print("\n3. Print Queue");
            System.out.print("\n0. Exit");
            System.out.print("\n-----------");
            System.out.print("\nEnter choice: ");
           
			choice=sc.nextInt();
			
			switch (choice) {
			case 1: 
				if(!obj.isFull()) {
					System.out.println("Enter element");
					e=sc.nextInt();
					obj.enqueue(e);
				}
				else {
					System.out.println("Queue full");
				}
				break;
				
			
			case 2:
				if(!obj.isEmpty()) {
					System.out.println("Dequeue element: "+obj.dequeue());
				}
				else {
					System.out.println("Queue Empty");
				}
				
			case 3: 
				if(!obj.isEmpty()) {
					obj.printQueue();
				}
				else {
					System.out.println("Queue Empty");
				}
				break;
			
			case 0:
				System.out.println("\nexiting");
				break;
			default:
				System.out.println("Ivalid choice");
			}
            
		}while(choice!=0);

	}

}
