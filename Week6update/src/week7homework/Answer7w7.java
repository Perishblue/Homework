package week7homework;

import java.util.Scanner;

public class Answer7w7 {
    // Write a java program to input any number and find out if it’s odd or even.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        if(number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");


    }

}

