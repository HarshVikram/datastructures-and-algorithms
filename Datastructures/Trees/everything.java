// IMPLEMENTING QUEUES USING ARRAYS
import java.io.*;
import java.util.*;

class Queue {
	private class Node {
		int data;
		Node next;
	}
	private Node first, last;
	private int s;

	public Queue() {
		this.first = this.last = null;
	}

	public void enqueue(int x) {
		Node newnode = new Node();
		if (newnode == null) {
            System.out.print("\nHeap Overflow");
            System.exit(1);
        }

		newnode.data = x;
		if (isEmpty()) {
			first = last = newnode;
			s++;
		} else {
			last.next = newnode;
			last = newnode;
			s++;
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.printf("\nQueue Underflow");
            System.exit(1);
		}

		Node temp = first;
		System.out.println("Removing " + peek());
		first = first.next;
        s--;
        
		if (first == null)
			last = null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.printf("\nQueue Underflow");
            System.exit(1);
		}
		System.out.println("Queue: ");
		Node temp = first;
		while (temp != null) {
			System.out.print("|" + temp.data + "| ");
			temp = temp.next;
		}
	}

	public int peek() {
		return first.data;
	}

	public boolean isEmpty() {
		return last == null;
	}

	public int size() {
		return s;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue queue = new Queue();
		
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