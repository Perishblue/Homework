package week7homework;

import java.util.Arrays;

public class Answer20w7 {

    // Write a Java program to sort a numeric array and a string array.

    public static void main(String[] args) {

        int[] dv = {
                12, 14, 16, 20, 25,
                18, 21, 31, 41, 51,
                52, 62, 72, 82, 92,
                93, 103, 113, 123, 133,
        };
        String[] dv1 = {
                "perish",
                "blue",
                "green",
                "yellow",
                "white"
        };

        System.out.println("Original numeric array : " + Arrays.toString(dv));

        Arrays.sort(dv);

        System.out.println("Sorted numeric array : " + Arrays.toString(dv));

                System.out.println("Original string array : " + Arrays.toString(dv1));

        Arrays.sort(dv1);

        System.out.println("Sorted string array : " + Arrays.toString(dv1));
    }
}
