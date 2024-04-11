import java.util.Scanner;

public class Answer5 {
    // 5. Write a program for a calculator with addition, subtraction, multiplication, and division
    //methods all with parameters and use string concatenation methods. (Note: Two static
    //and Two instance methods.)

    public static void main(String[] args) {
        int first, second, add, subtract, multiply;
        float divide;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two number : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        divide = first / second;

        System.out.println("sum = " + add);
        System.out.println("difference = " + subtract);
        System.out.println("multiplication = " + multiply);
        System.out.println("division = " + divide);

    }
}
