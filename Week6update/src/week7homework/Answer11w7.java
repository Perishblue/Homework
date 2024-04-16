package week7homework;

import java.util.Scanner;

public class Answer11w7 {
   /* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    other alphabet should be invalid entry.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters between A to F");
        String city = sc.nextLine();

        switch (city){
            case "A":
                System.out.println("Amritser");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Daman");
                break;
            case "D":
                System.out.println("Diu");
                break;
            case "E":
                System.out.println("Baroda");
                break;
            case "F":
                System.out.println("Goa");
                break;
            default:
                System.out.println("Invalid City");
        }
    }
}
