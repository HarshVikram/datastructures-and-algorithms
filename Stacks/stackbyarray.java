// IMPLEMENTING STACKS USING ARRAYS

import java.io.*;
import java.util.*;

class Stack {
	private int s[];
	private int top;
	private int capacity;

	public Stack(int size) {
		s = new int[size];
		capacity = size;
		top = -1;
	}
	public void push(int x) {
		if (isFull()) {
			System.out.println("Overflow\nProgram Terminated");
			System.exit(1);
		}
		top++;
		s[top] = x;
	}
	public void pop() {
		if (isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(1);
		}
		System.out.println("Poped element is " + s[top]);
		top--;
	}
	public int peek() {
		if (!isEmpty()) {
			return s[top];
		} else {
			System.exit(1);
		}
		return -1;
	}
	public void display() {
		for (int i = 0; i <= top; i++)
			System.out.println(s[i]);
	}
	public void size() {
		System.out.println(top + 1);
	}
	public Boolean isFull() {
		return top == capacity;
	}
	public Boolean isEmpty() {
		return top == -1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the stack to be created:");
		int n = sc.nextInt();
		Stack stack = new Stack(n);
		
		while (true) {
			System.out.println("\nEnter your choice\n1. PUSH\n2. POP\n3. DISPLAY\n4. SIZE\n5. EXIT");
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
			        stack.display();
			     	break;
			    case 4:
			     	stack.size();
			     	break;
			    case 5:
			     	System.exit(0); 
			    default:
			     	System.out.println("Wrong option");
			}
		}
	}
}