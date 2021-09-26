// DELETING ELEMENTS AT ANY PATICULAR POSITION IN AN ARRAY (USING 2 ARRAYS)
import java.util.*; 

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array to be created:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n - 1];

		System.out.println("Enter the position where the value is to be deleted in the array:");
   		int x = sc.nextInt();
   		for (int i = 0, j = 0; i < n; i++) {
			if (i == x)
				continue;
			b[j] = a[i];
			j++;
		}

		System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println("New Array: " + Arrays.toString(b));
    }
}

// DELETING ELEMENTS AT ANY PATICULAR POSITION IN AN ARRAY (USING FOR-LOOP)
import java.util.*; 

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array to be created:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Original Array: " + Arrays.toString(a));

		System.out.println("Enter the position where the value is to be deleted in the array:");
   		int x = sc.nextInt();
   		for (int i = x; i < n - 1; i++) {
			a[i] = a[i + 1];
		}
		a[n - 1] = 0;
		
        System.out.println("New Array: " + Arrays.toString(a));
    }
}