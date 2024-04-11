public class Answer5 {
    // 5. Write a program for a calculator with addition, subtraction, multiplication, and division
    //methods all with parameters and use string concatenation methods. (Note: Two static
    //and Two instance methods.)

    public static void main(String[] args) {
        int add, subtract, multiply;
        float divide;

        int first = 30;
        int second = 7;

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        divide = (float) first / second;

        System.out.println("sum = " + add);
        System.out.println("difference = " + subtract);
        System.out.println("multiplication = " + multiply);
        System.out.println("division = " + divide);

    }
}
