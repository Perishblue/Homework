package week7homework;

public class Answer21w7 {
   // Write a Java program to sum values of an array.

    public static void main(String[] args) {

        int [] arr = new int[] {12, 15, 10, 40, 5};
        int sum = 0;

        for (int y = 0; y < arr.length; y++) {
            sum = sum + arr[y];

        }
        System.out.println("Sum of all the elements of an array: " + sum);



    }
}
