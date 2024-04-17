package week7homework;

import java.util.Scanner;

public class Ans11w7 {
   // Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    //other alphabet should be invalid entry.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        System.out.println("Enter City name between A to F:");

        if (city == "A"){
            System.out.println("Ajmer");}
        if (city == "B"){
            System.out.println("Bombay");}
        if (city == "C"){
            System.out.println("Delhi");}
        if (city == "D"){
            System.out.println("DIu");}
        if (city == "E"){
            System.out.println("Daman");}
        if (city == "F"){
            System.out.println("Goa");}
        else
        {
            System.out.println("Invalid City");
        }
    }
}

