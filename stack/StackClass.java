package stack;

public class StackClass {

    private int tos, maxSize;
    private int stack[];

    // For creating stack
    public void createStack(int size) {

        maxSize = size;
        tos = -1;
        stack = new int[maxSize];
    }

    public boolean isFull() {

        if (tos == maxSize - 1)
            return true;
        else
            return false;
    }

    public void push(int data) {

        tos++;
        stack[tos] = data;
    }

    public int pop() {

        int temp = stack[tos];
        tos--;

        return temp;
    }

    public boolean isEmpty() {

        if (tos == -1)
            return true;
        else
            return false;
    }

    public int peek() {

        return stack[tos];
    }

    public void printStack() {

        for (int i = tos; i >= 0; i--) {

            System.out.println(stack[i]);
        }
    }
}