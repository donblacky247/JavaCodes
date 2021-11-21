package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x; int y; int z; int min; int max;

        System.out.println("Program that displays the sum, average, product, smallest and largest of 3 numbers");

        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        min = max = x;
        System.out.print("Enter the second integer: ");
        y = input.nextInt();
        if(min > y) {
            min = y;
        }
        if(max < y) {
            max = y;
        }
        System.out.print("Enter the third integer: ");
        z = input.nextInt();
        if(min > z) {
            min = z;
        }
        if(max < z) {
            max = z;
        }

        System.out.printf("%nSum is %d%n", x + y + z);
        System.out.printf("Average is %d%n", (x + y + z) / 3);
        System.out.printf("Product is %d%n", x * y * z);
        System.out.printf("Smallest is %d%n", min);
        System.out.printf("Largest is %d%n", max);
    }
}
