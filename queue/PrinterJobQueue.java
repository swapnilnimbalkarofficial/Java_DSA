package queue;

public class PrinterJobQueue {

    private String queue[];
    private int front;
    private int rear;
    private int maxSize;

    void createQueue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queue = new String[maxSize];
    }

    void enqueue(String job) {
        queue[++rear] = job;
    }

    boolean isFull() {
        return rear == maxSize - 1;
    }

    String dequeue() {
        return queue[front++];
    }

    boolean isEmpty() {
        return front > rear;
    }

    String peek() {
        return queue[front];
    }

    void display() {
        System.out.println("Print Jobs:");

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}