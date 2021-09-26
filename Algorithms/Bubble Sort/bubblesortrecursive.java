// Java program for implementation of Selection Sort
import java.io.*;
import java.util.*;

public class Main {
	public static void sort(int a[], int n) {
		if (n == 1)
			return;
			
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}					
		}
		sort(a, n - 1);
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