# ARRAYS
Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
* In Java all arrays are dynamically allocated.(discussed below)
* The variables in the array are ordered and each have an index beginning from 0.
* Java array can be also be used as a static field, a local variable or a method parameter.
* The size of an array must be specified by an int or short value and not long.
* The direct superclass of an array type is Object.

Array can contain primitives (int, char, etc.) as well as object (or non-primitive) references of a class depending on the definition of the array. In case of primitive data types, the actual values are stored in contiguous memory locations. In case of objects of a class, the actual objects are stored in heap segment.

![Visual represetaion of arrays](https://media.geeksforgeeks.org/wp-content/uploads/Arrays1.png)

To declare/create an array, you could write:
```java
String[] cars;

int[] myNum = {10, 20, 30, 40};
```

## Declaring and Instantiating
When an array is declared, only a reference of array is created. To actually create or give memory to array, you create a one-dimensional array like this:
```java
name = new type [size];
```
Here, type specifies the type of data being allocated, size specifies the number of elements in the array, and name is the name of array variable that is linked to the array. That is, to use new to allocate an array, you must specify the type and number of elements to allocate.
```java
int array[];    //declaring array
array = new int[20];  // allocating memory to array
```
```java
int[] array = new int[20]; // combining both statements in one
```

## Array Literal
In a situation, where the size of the array and variables of array are already known, array literals can be used.
```java
 int[] array = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; // Declaring array literal
```
The length of this array determines the length of the created array.
There is no need to write the `new int[]` part in the latest versions of Java

## Accessing Array Elements using Loops
Each element in the array is accessed via its index. The index begins with 0 and ends at (total array size - 1).
```java
class Main
{
    public static void main (String[] args) 
    {         
      int[] array = new int[5];

      array[0] = 10;
      array[1] = 20;
      array[2] = 30;
      array[3] = 40;
      array[4] = 50;
          
      for (int i = 0; i < array.length; i++)
        System.out.println("Element at index " + i + " : "+ array[i]);
    }
}
```
There is also a `for-each` loop, which is used exclusively to loop through elements in arrays:
```java
class Main
{
    public static void main (String[] args) 
    {         
      int[] array = new int[5];

      array[0] = 10;
      array[1] = 20;
      array[2] = 30;
      array[3] = 40;
      array[4] = 50;
          
      for (int i : array)
        System.out.println(i);
    }
}
```
If you compare the `for` loop and `for-each` loop, you will see that the `for-each` method is easier to write, it does not require a counter (using the length property), and it is more readable.

## Arrays of Objects
An array of objects is created just like an array of primitive type data items in the following way.
```java
 Student[] array = new Student[7]; //student is a user-defined class
```
The Student array contains seven memory spaces each of size of Student class in which the address of seven Student objects can be stored. The Student objects have to be instantiated using the constructor of the Student class and their references should be assigned to the array elements in the following way.
```java
class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Main
{
    public static void main (String[] args)
    {
        Student[] array;  // declares an array of Students
        array = new Student[5];  // allocating memory for 5 objects of type Students
  
        // initialize the  elements of the array
        arr[0] = new Student(1,"John");
        arr[1] = new Student(2,"Michael");
        arr[2] = new Student(3,"Franklin");
        arr[3] = new Student(4,"Ana");
        arr[4] = new Student(5,"Lisa");

        for (int i : array)
            System.out.println(i);
    }
}
```

## Passing Arrays to Methods
Like variables, we can also pass arrays to methods.
```java
class Main {
    public static void main(String args[]) {
        int array[] = {3, 1, 2, 5, 4};
        sum(array);
    }
  	public static void sum(int[] arr) {
        int sum = 0;
        for (int i : array)
            sum =+ i;
          
        System.out.println("Sum of array values : " + sum);
    }
}
```

## Returning Arrays from Methods
As usual, a method can also return an array.
```java
class Main {    
    public static void main(String args[]) {
        int array[] = input();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
      
    }
  	public static int[] input() {
        return new int[]{1,2,3};
    }
}
```