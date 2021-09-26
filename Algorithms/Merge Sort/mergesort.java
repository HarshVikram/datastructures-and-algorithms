//MERGE SORT
import java.io.*;
import java.util.*;

public class Main {
	public static void merge(int a[], int l, int m, int r) {
		// Find the size of the two arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];
		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = a[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = a[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = L[i];
            i++;
            k++;
		}
		while (j < n2) {
			a[k] = R[j];
            j++;
            k++;
		}
	}

	public static void sort(int a[], int l, int r) {
		if (l < r) {
 			int m = l + ((r - 1) / 2);

			sort(a, l , m);
			sort(a, m + 1, r);

			merge(a, l, m, r); 
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

        sort(a, 0, n - 1);
        print(a);       
	}
}