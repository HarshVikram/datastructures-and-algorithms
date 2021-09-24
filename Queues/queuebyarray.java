// IMPLEMENTING QUEUES USING ARRAYS
import java.io.*;
import java.util.*;

class Queue {
	private int first, last, capacity;
	private int q[];

	public Queue(int size) {
		q = new int[size];
		capacity = size;
		first = last = 0;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Overflow\nProgram Terminated");
			System.exit(1);
		}
		q[last] = data;
		last++;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(1);
		}
		for (int i = 0; i < last - 1; i++)
			q[i] = q[i + 1];

		if (last < capacity)
			q[last] = 0;
		last--;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.print("The queue is: ");
			for (int i = first; i < last; i++)
            	System.out.print("|" + q[i] + "| ");
		}
	}

	public int peek() {
		return q[first];
	}

	public boolean isEmpty() {
		return first == last;
	}

	public boolean isFull() {
		return capacity == last;
	}

	public int size() {
		return last + 1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the queue to be created:");
		int n = sc.nextInt();
		Queue queue = new Queue(n);
		
		while (true) {
			System.out.println("\nEnter your choice\n1. ENQUEUE\n2. DEQUEUE\n3. PEEK\n4. DISPLAY\n5. SIZE\n6. EXIT");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
			     	System.out.println("Enter element to be inserted:");
			     	int x = sc.nextInt();
			     	queue.enqueue(x);
			     	break;
			    case 2:
			     	queue.dequeue();
			     	break;
			    case 3:
			     	System.out.println("The front element is " + queue.peek());
			     	break;
			    case 4:
			        queue.display();
			     	break;
			    case 5:
			     	System.out.println("The size of queue is " + queue.size());
			     	break;
			    case 6:
			     	System.exit(0); 
			    default:
			     	System.out.println("Wrong option");
			}
		}
	}
}