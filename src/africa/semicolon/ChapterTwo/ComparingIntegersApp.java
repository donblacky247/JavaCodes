package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class ComparingIntegersApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x; int y;

        System.out.println("Program that compares integers");

        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        if(x > y) {
            System.out.printf("%d is larger%n", x);
        }

        if(x < y) {
            System.out.printf("%d is larger%n", y);
        }

        if(x == y) {
            System.out.printf("These numbers are equal%n");
        }
    }
}
