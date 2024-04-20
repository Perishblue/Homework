package week7homework;

public class Answer26w7 {

    /*Write a Java program to reverse a word.
    Sample Output:
    Input a word: dsaf
    Reverse word: fasd*/

    public static void main(String[] args) {

        String str = "Perishblue";
        byte[] byteArray = str.getBytes();
        byte[] reversedArray = new byte[byteArray.length];
        for (int i = byteArray.length - 1,j =0; i >= 0; i--,j++) {
            reversedArray[j] = byteArray[i]; }
        String reversedString = new String(reversedArray);
        System.out.println("Oringinal srtin: " + str);
        System.out.println("Reversed string: " + reversedString);

        }

    }

