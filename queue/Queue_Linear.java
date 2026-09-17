package queue;

public class Queue_Linear {
	private int front;
	private int rear;
	private int maxSize;
	private int queue[];
	
	void createQueue(int size) {
	    front = 0;
	    rear = -1;
	    maxSize = size;
	    queue = new int[maxSize];
	}
	
	void enqueue(int e) {
		queue[++rear]=e;//increment rear and insert element
	}
	
	boolean isFull() {
		return(rear==maxSize-1);
	}
	
	int dequeue() {
		return(queue[front++]);
	}
	
	boolean isEmpty() {
		return (front>rear);
	}
	
	void printQueue() {
		System.out.println("Queue elements(FIFO): ");
		for(int i=front; i<=rear; i++) {
			System.out.println(queue[i]+" ");
		}
	}
	
}
