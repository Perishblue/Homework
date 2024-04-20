package week7homework;

public class Answer22w7 {

    //Write a Java program to calculate the average value of array elements.

    public static void main(String[] args) {

        int[] num = new int[] {10, 25, 30, -40, -50, 60, 20};
        int sum = 0;

        for (int i : num) {
            sum = sum + i;
        }
        double average = sum / num.length;

        System.out.println("Average value of the array elements is: " + average);

    }
}
