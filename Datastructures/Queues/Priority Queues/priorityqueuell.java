import java.util.*;

class PriorityQueue {
	private class Node {
		int data;
		int priority; // Lower value ndicates higher priority
		Node next;
		Node(int d, int p) {
			this.data = d;
			this.priority = p;
			this.next = null;
		}
	}

	private Node head;

	public PriorityQueue() {
		this.head = null;
	}

	static Node push(Node head, int d, int p) {
		Node newnode = new Node(d, p);
		Node temp = head;

		if (head.priority > p) {
			newnode.next = head;
			head = newnode;
		} else {
			while (temp.next != null && temp.next.priority < p)
				temp = temp.next;

			newnode.next = temp.next;
			temp.next = newnode;
		}
		return head;
	}

	static Node pop(Node head) {
	    Node temp = head;
	    head = head.next;
	    return head;
	}

	static int peek(Node head) {
    	return (head).data;
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
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Queue queue = new Queue();
		
		while (true) {
			System.out.println("\nEnter your choice\n1. ENQUEUE\n2. DEQUEUE\n3. PEEK\n4. DISPLAY\n5. SIZE\n6. EXIT");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
			     	System.out.println("Enter element to be inserted:");
			     	int x = sc.nextInt();
			     	queue.push(x);
			     	break;
			    case 2:
			     	queue.pop();
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