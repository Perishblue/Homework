package week7homework;

import java.util.Scanner;

public class Answer19w7 {

    // Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int dv = sc.nextInt();

        if ( dv > 0) {
            System.out.println("Enter Positive number");}
        else if (dv < 0) {
            System.out.println("Enter Negative number");}
        else {
            System.out.println("Number is Zero");
        }

    }

}

