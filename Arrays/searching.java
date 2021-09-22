// INSERTING ELEMENTS AT ANY PATICULAR POSITION IN AN ARRAY
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

   	    System.out.println("Enter the value to be replaced in the array:");
   		int value = sc.nextInt();

   		System.out.println("Enter the position where the value is to be replaced in the array:");
   		int x = sc.nextInt();

   		for (int i = 0; i < n; i++) {
   			if (i == x)
   				a[i] = value;
   		}
		
        System.out.println("New Array: " + Arrays.toString(a));
    }
}

// Deleting element by its value when the array contains duplicates