// Java program for implementation of Selection Sort
import java.io.*;
import java.util.*;

public class Main {
	public static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}					
			}
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