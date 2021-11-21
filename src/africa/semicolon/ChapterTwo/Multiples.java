package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x; int y;

        System.out.println("Program that determines whether the first is a multiple of the second ");

        System.out.print("Enter the first value: ");
        x = input.nextInt();
        System.out.print("Enter the second value: ");
        y = input.nextInt();

        if(x % y == 0) {
            System.out.println(x + " is a multiple of " + y);
        }

        if(x % y != 0) {
            System.out.println(x + " is not a multiple of " + y);
        }
    }
}
