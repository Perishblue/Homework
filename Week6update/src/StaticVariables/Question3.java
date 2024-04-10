package StaticVariables;

public class Question3 {
    // Write a Java programme using the following steps.
    // Call both static variables into the static method inside the print statement.

    static String name = "perish";
    static String name1 = "blue";

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(name1);
        Question3 a = new Question3();
        a.m();


    }

    public void m() {
        String course = "java";
        System.out.println(course);
        System.out.println(name);
        System.out.println(name1);

    }
}
