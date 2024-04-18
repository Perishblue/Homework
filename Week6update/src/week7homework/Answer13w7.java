package week7homework;

import java.util.Scanner;

public class Answer13w7 {
   /*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1, number2, result;
        char Operator;

        System.out.println("Enter first number");
        number1 = sc.nextInt();

        System.out.println("Enter type of operation (+, -, *, /,): ");
        Operator = sc.next().charAt(0);
        System.out.println("Enter second number");
number2 = sc.nextInt();

if (Operator == '+')
{result = number1 + number2;}
else if (Operator == '-')
{result = number1 - number2;}
else if (Operator == '*')
{result = number1 * number2;}
else if (Operator == '/'){
if (number2!=0){
result = number1 / number2;}
else {
    System.out.println("Error");}
return;
}
else {
        System.out.println("Error: invaild number");
return;
}
System.out.println("Result:" + result);
}
}
