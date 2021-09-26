import java.io.*;
import java.util.*;

class LinkedList {
	private class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	private Node head;
	private int s;
	public LinkedList() {
		this.s = 0;
		this.head = null;
	}

	public void insert(int x) {
		Node newnode = new Node(x);

		if (head == null) {
			head = newnode;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = newnode;
		}
	}

	public void delete(int position) {
		if (head == null)
            return;

		Node temp = head;

		if (position == 0) {
            head = temp.next;
            return;
        }
        
		for (int i = 0; temp != null && i < (position - 1); i++)
            temp = temp.next;
        
        if (temp == null || temp.next == null)
            return;
		temp.next = temp.next.next;  
	}

	public boolean search(int element) {
		if (head == null)
            return false;

		Node temp = head;
		while (temp.next != null) {
			if (temp.data == element)
				return true;

            temp = temp.next;
		}
		return false;
	}

	public void print() {
		Node node = head;
		System.out.print("Linked List: ");
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public int size() {
		Node node = head;
		while (node != null) {
			node = node.next;
			s++;
		}
		return s;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();

		while (true) {
			System.out.println("\nEnter your choice\n1. INSERT\n2. DELETE\n3. SEARCH\n4. DISPLAY\n5. SIZE\n6. EXIT");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
			     	System.out.println("Enter element to be inserted:");
			     	int x = sc.nextInt();
			     	list.insert(x);
			     	break;
			    case 2:
			    	System.out.println("Enter the position where the deleted:");
			     	int y = sc.nextInt();
			     	list.delete(y - 1);
			     	break;
			    case 3:
			    	System.out.println("Enter the element to be searched:");
			     	int z = sc.nextInt();
			     	String result = (list.search(z)) ? "The element " + z + " is in the list" : "The element " + z + " is not in the list";
					System.out.println(result);
			     	break;
			    case 4:
			        list.print();
			     	break;
			    case 5:
			     	System.out.println("The size of list is " + list.size());
			     	break;
			    case 6:
			     	System.exit(0); 
			    default:
			     	System.out.println("Wrong option");
			}
		}
    }
}