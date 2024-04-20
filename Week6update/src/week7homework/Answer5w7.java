package week7homework;

import java.util.Scanner;

public class Answer5w7 {
   /* Write a java program to input student Name, roll No, and three subjects Math, Science and English
    marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
            should between 0 to 100”) and find out total, percentage and result.
    If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
            %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
   static int Maths, Hindi, English, Total;
    static float per;
    static String result, grade;
    public static void main(String[] args) {
        mark();
    }
       public static void mark () {
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter student name");
            String name = sc.nextLine();

            System.out.println("Enter student Roll number");
            int rollNo = sc.nextInt();

            System.out.println("Enter Maths subject mark :");
            Maths = sc.nextInt();

            if (Maths >= 0 && Maths <= 100) {
                System.out.println("Enter Hindi subject mark :");
                Hindi = sc.nextInt();
                System.out.println("Enter English subject mark");
                English = sc.nextInt();

            }
            else {
                System.out.println("Please enter marks between 0 and 100");
            }
            Total = Maths + Hindi + English;
            per = Total / 3;

            if (per >= 35) {
                result = "pass"; }
            if (per >= 80) {
                grade = "A+"; }
                else if (per >= 60 && per < 80) {
                    grade = "A"; }
                else if (per >= 50 && per < 60) {
                    grade = "B"; }
                else if (per >= 40 && per < 35) {
                    grade = "C"; }
                else {
                    result = "fail";}

        System.out.println("------------------------------");
        System.out.println("|                            |");
        System.out.println("|          Mark sheet        |");
        System.out.println("|    name  :   " + name +"   |");
        System.out.println("| Roll No  :   " + rollNo +" |");
        System.out.println("|============================|");
        System.out.println("|  Subject :     mark        |");
        System.out.println("|  Maths   :   "+Maths +"    |");
        System.out.println("|  Hindi   :   "+Hindi +"    |");
        System.out.println("|  English :   "+English +"  |");
        System.out.println("|============================|");
        System.out.println("|  Total   :   "+Total +"    |");
        System.out.println("|============================|");
        System.out.println("|Percentage:   "+per +"      |");
        System.out.println("|   result  :   "+result +"  |");
        System.out.println("|  grade   :   "+grade + "   |");
        System.out.println("-----------------------------|");

            }
                }