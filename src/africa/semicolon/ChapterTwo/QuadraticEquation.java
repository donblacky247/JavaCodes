package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        a = input.nextInt();

        System.out.print("Enter your second number: ");
        b = input.nextInt();

        System.out.print("Enter your third number: ");
        c = input.nextInt();

        double result1 = (-b) + Math.sqrt(b*b)-(4*a*c)/(2*a);

        double result2 = (-b) - Math.sqrt(b*b)-(4*a*c)/(2*a);

        System.out.printf("The Root1 is %.2f And The Root2 is %.2f: ", result1,result2);
    }
}