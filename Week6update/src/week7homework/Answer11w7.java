package week7homework;

import java.util.Scanner;

public class Answer11w7 {

    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
    //other alphabet should be invalid entry.

    public static void main(String[] args) {

        Scanner game = new Scanner(System.in);
        String  city = game.nextLine();
        System.out.println("Enter Starting Letter Between A to F:");

        if (city == "A"){
            System.out.println("Abu");}
        if (city == "B"){
            System.out.println("Bombay");}
        if ( city == "C"){
            System.out.println("California");}
        if (city == "D"){
            System.out.println("Dehradun");}
        if (city == "E"){
            System.out.println("Egypt");}
        if (city == "F"){
            System.out.println("France");}
        else
        {
            System.out.println("INVALID ENTRY");
        }
        }
    }




