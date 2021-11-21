package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class SeparatingDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("Program that Separates the Digits in an Integer");

        System.out.print("Enter the integer: ");
        x = input.nextInt();


        int fifth = x % 10;
        int fourth = (x / 10) % 10;
        int third = ((x / 10) / 10) % 10;
        int second = (((x / 10) / 10) / 10) % 10;
        int first = (((x / 10) / 10) / 10) /10;
        System.out.printf("%d %d %d %d %d%n", first, second, third, fourth, fifth);

    }
}
