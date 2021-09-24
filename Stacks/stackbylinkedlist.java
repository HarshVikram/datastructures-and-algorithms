// IMPLEMENTING STACKS USING LINKED LISTS
import java.io.*;
import java.util.*;

class Stack {
	private class Node {
		int data;
		Node next;
	}

	private Node top;
	private int s = 0;
	
	public Stack() {
		this.top = null;
	}

	public void push(int x) {
		Node newnode = new Node();
		if (newnode == null) {
            System.out.print("\nHeap Overflow");
            System.exit(1);
        }
        newnode.data = x;
		newnode.next = top;
		top = newnode;
		s++;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(1);
		} else {
			System.out.println("Removing " + peek());
			top = top.next;
			s--;
		}
	}
	public int size() {
		return s;
	}
	public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
	public void display() {
		Node temp = top;
		if (isEmpty()) {
            System.out.printf("\nStack Underflow");
            System.exit(1);
        }
		System.out.println("Linked List: ");
		while (temp != null) {
			System.out.println("|" + s[i] + "|");
			temp = temp.next;
		}
	}
	public Boolean isEmpty() {
		return top == null;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack stack = new Stack();

		while (true) {
			System.out.println("\nEnter your choice\n1. PUSH\n2. POP\n3. PEEK\n4. DISPLAY\n5. SIZE\n6. EXIT");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
			     	System.out.println("Enter element to be inserted:");
			     	int x = sc.nextInt();
			     	stack.push(x);
			     	break;
			    case 2:
			     	stack.pop();
			     	break;
			    case 3:
			    	System.out.println("The top element is " + stack.peek());
			     	break;
			    case 4:
			        stack.display();
			     	break;
			    case 5:
			    	System.out.println("The size of stack is " + stack.size());
			     	break;
			    case 6:
			     	System.exit(0); 
			    default:
			     	System.out.println("Wrong option");
			}
		}
	}
}