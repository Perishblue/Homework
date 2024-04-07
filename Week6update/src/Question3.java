public class Question3 {
   // Write a Java program to print the result of the following operations.
    //Test Data: a. -5 + 8 * 6
    //           b. (55+9) % 9
    //           c. 20 + -3*5 / 8
    //           d. 5 + 15 / 3 * 2 - 8 % 3

    //Expected Output : 43
    //                  1
    //                  19
    //                  13

    public static void main(String[] args) {
        // Calculate and store the result of the expression: -5 + 8 * 6
        int w = -5 + 8 * 6;

        // Calculate and store the result of the expression: (55 + 9) % 9
        int x = (55 + 9) % 9;

        // Calculate and store the result of the expression: 20 + (-3 * 5 / 8)
        int y = 20 + (-3 * 5 / 8);

        // Calculate and store the result of the expression: 5 + 15 / 3 * 2 - 8 % 3
        int z = 5 + 15 / 3 * 2 - 8 % 3;

        // Print the calculated values, each on a new line
        System.out.println("Expected Output : "+w + "\n" + x + "\n" + y + "\n" + z);

    }

}
