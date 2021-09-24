import java.io.*;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	public static void insert(LinkedList list, int data) {
		Node new_node = new Node(data);

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
	}
	public static void deletion(int position) {
		Node temp = head;

		for (int i = 0; temp != nul; && i < position - 1; i++)
			temp = temp.next;

		temp.next = temp.next.next;  
	}
	public static void print(LinkedList list) {
		Node curr_node = list.head;
		System.out.print("Linked List: ");
		while (curr_node != null) {
			System.out.print(curr_node.data + " ");
			curr_node = curr_node.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);
        list.insert(list, 8);

        print(list);

        list.deletion(5);
        list.deletion(2);

        print(list);
    }
}