import java.util.Scanner;

public class Question5 {

    // Write a Java program that takes a number as input and prints its multiplication
    // table upto 10.
    // Expected Output :
    //        8 x 1 = 8
    //        8 x 2 = 16
    //        8 x 3 = 24
    //        ...
     //       8 x 10 = 80

    public static void main(String[] args) {

        // Create a scanner object to read input
        Scanner in = new Scanner(System.in);

        // User input a number
        System.out.println("Input a number");

        // Read and store input number
        int num1 = in.nextInt();

        // use a loop to calculate the multiplication table
        for (int i = 0; i < 10; i++) {

            // Calculate the result by multiplies
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));

        }
        }
    }

