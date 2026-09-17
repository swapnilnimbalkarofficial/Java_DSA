package queue;

public class CircularQueue {

    private int queue[], front, rear, MaxSize, count;

    public void createQueue(int size) {
        MaxSize = size;
        rear = 0;
        front = 0;
        count = 0;
        queue = new int[MaxSize];
    }

    void enqueue(int e) {
        queue[rear] = e;
        rear = (rear + 1) % MaxSize;
        count++;
    }

    boolean isFull() {
        return (count == MaxSize);
    }

    int dequeue() {
        int temp = queue[front];

        front = (front + 1) % MaxSize;
        count--;

        return temp;
    }

    boolean isEmpty() {
        return (count == 0);
    }

    void print_queue() {
        int i = front;
        int c = 0;

        while (c < count) {
            System.out.print(queue[i] + " - ");
            i = (i + 1) % MaxSize;
            c++;
        }
        System.out.println();
    }
}