package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("Program that prints whether a value is odd or even");

        System.out.print("Enter the value: ");
        x = input.nextInt();

        if(x % 2 == 0) {
            System.out.println(x + " is even");
        }

        if(x % 2 != 0) {
            System.out.println(x + " is odd");
        }
    }
}
