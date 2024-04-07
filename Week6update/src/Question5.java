public class Question5 {

    // Write a Java program that takes a number as input and prints its multiplication
    // table upto 10.
    // Expected Output :
    //        8 x 1 = 8
    //        8 x 2 = 16
    //        8 x 3 = 24
    //        ...
     //       8 x 10 = 80

    public static void main(String[] args) {

        // Multipal by number

        int num = 8;
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%d * %d \n" , num, i, num * i);

        }
    }
}
