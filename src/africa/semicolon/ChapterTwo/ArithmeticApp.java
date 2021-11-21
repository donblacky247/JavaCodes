package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class ArithmeticApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x; int y;

        System.out.println("Program that prints the product, difference and quotient (division) of two integers");

        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.printf("%nSum is %d%n", x + y);
        System.out.printf("Product is %d%n", x * y);
        System.out.printf("Difference is %d%n", x - y);
        System.out.printf("Quotient is %d%n", x / y);
    }
}
