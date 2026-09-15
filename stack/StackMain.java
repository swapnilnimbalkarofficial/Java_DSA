package stack;

import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {

        StackClass stack = new StackClass();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();

        stack.createStack(size);

        int choice;

        do {

            System.out.println("""
                    
                    Stack Menu:
                    1. Push
                    2. Pop
                    3. Peek
                    4. Print Stack
                    5. Exit
                    """);

            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    if(!stack.isFull()) {

                        System.out.println("Enter element to push: ");
                        int e = sc.nextInt();

                        stack.push(e);
                    }
                    else {
                        System.out.println("Stack is full");
                    }

                    break;


                case 2:

                    if(!stack.isEmpty()) {

                        System.out.println(
                            "Element popped: " + stack.pop()
                        );
                    }
                    else {
                        System.out.println("Stack is empty");
                    }

                    break;


                case 3:

                    if(!stack.isEmpty()) {

                        System.out.println(
                            "Peek element: " + stack.peek()
                        );
                    }
                    else {
                        System.out.println("Stack is empty");
                    }

                    break;


                case 4:

                    if(!stack.isEmpty()) {

                        System.out.println("\nElements on Stack:");
                        stack.print_stack();
                    }
                    else {
                        System.out.println("Stack is empty");
                    }

                    break;


                case 5:

                    System.out.println("Exiting...");

                    break;


                default:

                    System.out.println("Invalid choice");

            }

        } while(choice != 5);

        sc.close();
    }
}