import java.util.Scanner;

public class Question6 {
             // Write a Java program to display. Expected Output
             // 25 != 39
             // 25 < 39
             // 25 <= 39
             public static void main(String[] args) {
         // Create scanner to input from the command window
                 Scanner input = new Scanner(System.in);
                 int num1; // Input first number
                 int num2; // Input second number

                 // Input the first integer
                 System.out.println("Input first integer: ");
                 num1 = input.nextInt(); // Read the first num from user

                 // Input the second integer
                 System.out.println("Input second integer: ");
                 num2 = input.nextInt(); // Read the second num from user

                 // Compare and display the result

                 if (num1 == num2)
                     System.out.printf("%d == %d\n", num1, num2);
                 if (num1 != num2)
                     System.out.printf("%d != %d\n", num1, num2);
                 if (num1 < num2)
                     System.out.printf("%d < %d\n", num1, num2);
                 if (num1 > num2)
                     System.out.printf("%d > %d\n", num1, num2);
                 if (num1 <= num2)
                     System.out.printf("%d <= %d\n", num1, num2);
                 if (num1 >- num2)
                     System.out.printf("%d >= %d\n", num1, num2);

             }

}
