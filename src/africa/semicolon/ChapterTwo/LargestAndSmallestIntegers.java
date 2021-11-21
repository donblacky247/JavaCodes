package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int currentValue; int largest; int smallest;

        System.out.println("Program that determines and prints the largest and smallest integers in the group");

        System.out.print("Enter the first integer: ");
        currentValue = input.nextInt();
        largest = smallest = currentValue;
        System.out.print("Enter the second integer: ");
        currentValue = input.nextInt();
        if(largest < currentValue) {
            largest = currentValue;
        }
        if(smallest > currentValue) {
            smallest = currentValue;
        }
        System.out.print("Enter the third integer: ");
        currentValue = input.nextInt();
        if(largest < currentValue) {
            largest = currentValue;
        }
        if(smallest > currentValue) {
            smallest = currentValue;
        }
        System.out.print("Enter the fourth integer: ");
        currentValue = input.nextInt();
        if(largest < currentValue) {
            largest = currentValue;
        }
        if(smallest > currentValue) {
            smallest = currentValue;
        }
        System.out.print("Enter the fifth integer: ");
        currentValue = input.nextInt();
        if(largest < currentValue) {
            largest = currentValue;
        }
        if(smallest > currentValue) {
            smallest = currentValue;
        }

        System.out.printf("Largest is %d%n", largest);
        System.out.printf("Smallest is %d%n", smallest);

    }
}
