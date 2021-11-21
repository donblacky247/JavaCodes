package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class CylinderInFahrenheit {

    public static void main(String[] args)
    {
        double radius;
        double length;
        double area;
        double volume;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        radius = input.nextDouble();

        System.out.println("Enter length of cylinder: ");
        length = input.nextDouble();

        area = radius * radius * Math.PI;
        System.out.printf("The area is %f%n", area);

        volume = area * length;
        System.out.printf("The volume is %f%n", volume);
    }
}
