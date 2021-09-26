// INSERTING ELEMENTS AT END OF AN ARRAY
import java.util.*; 

public class Main { 
	public static void main(String[] args) {
   	    int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   	    int[] b = Arrays.copyOf(a, a.length + 1);
   	    // int[] b = new int[a.length + 1];
   	    // for (int j = 0; j < a.length; j++) {
   	    // 	b[j] = a[j];
   	    // }
   		int i = 2;
   		int value = 5;
		System.out.println("Original Array : " + Arrays.toString(a));     
        b[b.length - 1] = value;
        System.out.println("New Array : " + Arrays.toString(b));
    }
}

// INSERTING ELEMENTS AT THE START OF AN ARRAY
import java.util.*; 

public class Main { 
	public static void main(String[] args) {
   	    int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   	    int[] b = Arrays.copyOf(a, a.length + 1);
   	    // int[] b = new int[a.length + 1];
   	    // for (int j = 0; j < a.length; j++) {
   	    // 	b[j] = a[j];
   	    // }
   		int i = 2;
   		int value = 5;
		System.out.println("Original Array : " + Arrays.toString(a));
		for (int j = 0; j < (b.length - 1); j++) {
			b[j] = b[j + 1];
		}    
        b[0] = value;
        System.out.println("New Array : " + Arrays.toString(b));
    }
}

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
   	    int[] b = Arrays.copyOf(a, n + 1);

   	    System.out.println("Enter the value to be inserted in the array:");
   		int value = sc.nextInt();

   		System.out.println("Enter the position where the value is to be inserted in the array:");
   		int x = sc.nextInt();

   		if (x == a.length) {
   			b[x] = value;
   		} else if (x == 0) {
   			for (int i = 0; i < (b.length - 1); i++) {
   				b[i] = b[i + 1];
   			}
   			b[x] = value;
   		} else {
   			for (int i = (b.length - 2); i >= x; i--) {
   				b[i + 1] = b[i];
   			}
   			b[x] = value;
   		}
		System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println("New Array: " + Arrays.toString(b));
    }
}