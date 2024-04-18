package week7homework;

import java.util.Scanner;

public class Answer15w7 {
    // Write a program that tells us input value is number or an alphabet orsymbol.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet, number or symbol");
        char dv = sc.next().charAt(0);

        if ((dv >= 'A' && dv <= 'Z')){
            System.out.println("is A Alphabet");
        }
        else if ((dv >= '0' && dv <= '9')){
            System.out.println("is A Digit");
        }
        else{
            System.out.println("is A Symbol");
        }
    }
}

