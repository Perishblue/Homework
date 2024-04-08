package InstanceVariables;

public class Question3 {
    // 1. Write a Java programme using the following steps.
    // 1.3 Call both instance variables into the instance method inside the print statement.

    String name = "darshan";
    String name1 = "visnudas";

    // instance variable
    public static void main(String[] args) {
        String name = "darshan";
        System.out.println(name);
        Question3 a = new Question3();
        a.m1();
    }

    public void m1() {
        String course = "dars";
        System.out.println(course);
        System.out.println(name);
        System.out.println(name1);


    }
        public void name(){
            System.out.println("darshan visnudas");

    }
}
