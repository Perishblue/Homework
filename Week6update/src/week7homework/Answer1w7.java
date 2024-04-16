package week7homework;

import java.util.Scanner;

public class Answer1w7 {
   /* Write a java program that tells us that Input number is odd or even? HINT: use ternary
    operator (? :)*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        // ternary operator to check number ? use for condition
        String result = number%2==0 ? "Even" : "Odd";

        System.out.println(number +"is "+ result);
    }
}
