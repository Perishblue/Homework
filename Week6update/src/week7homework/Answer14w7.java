package week7homework;

public class Answer14w7 {
    // Write a java program to print the numbers between 1 to 100 which can be divided by 3and
    // 5 separately.

    public static void main(String[] args) {

        System.out.println("Divide by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\nDivide by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
    }
}
