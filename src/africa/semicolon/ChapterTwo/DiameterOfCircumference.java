package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class DiameterOfCircumference {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.println("Program that calculates and prints the Diameter, Circumference and Area of a Circle");

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt();

        System.out.printf("Diameter = %d%n", 2 * radius);
        System.out.printf("Circumference = %f%n", 2 * Math.PI * radius);
        System.out.printf("Area = %f%n", Math.PI * radius * radius);
    }
}
