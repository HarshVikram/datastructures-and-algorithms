// Java program for implementation of Selection Sort
import java.io.*;
import java.util.*;

public class Main {
	public static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[minindex] > a[j])
					minindex = j;
			}
			int temp = a[i];
			a[i] = a[minindex];
			a[minindex] = temp;
		}
	}

	public static void print(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
    }

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        sort(a);
        print(a);       
	}
}
