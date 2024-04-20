package week7homework;

import java.util.Scanner;

public class Answer10w7 {
   /* Write a java program input sales id, seller's name, sales amount, and salary basic and then
    fined this sales
            Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
            >= 20,000 10%
            >= 10,000 5%
< 10,000 2% */
   public static void main(String[] args) {

       double sale, commission = 0.0;
       int rate = 0;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the sale amount: ");
       sale = (int) sc.nextDouble();

       if(sale <= 50000) {
           rate = 35;
           commission = sale * 0.35; }
       if (sale >= 30000 && sale <= 50000) {
           rate = 20;
           commission = sale * 0.20; }
       if (sale >= 20000 && sale <= 30000) {
           rate = 10;
           commission = sale * 0.10; }
       if (sale >= 10000 && sale <= 20000) {
           rate = 5;
           commission = sale * 0.5; }
       if (sale <= 10000) {
           rate = 2;
           commission = sale * 0.2; }
       System.out.println("Commission amount = " +commission);
       System.out.println("Commission rate = " +rate+"%");

       }
   }

