public class Answer6 {
    // Write a program to enter any radius value of the circle and find out the area. (Formula
    // of Area A=PI*r*r).

    public static final double radius = 6.5;

    public static void main(String[] args) {

        // calculate the perimeter of the circle using the constant radius
        double perimeter = 3 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        // Print the calculated perimeter and area
        System.out.println("perimeter is = " + perimeter);
        System.out.println("area is = " + area);


    }
}
