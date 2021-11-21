package africa.semicolon.ChapterThree;

import java.util.Scanner;

public class Palindrome {

    public static void main(String args[])
    {
        String x, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check if it is a palindrome");
        x = input.nextLine();
        int length = x.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + x.charAt(i);
        if (x.equals(reverse))
            System.out.println("This number is a palindrome.");
        else
            System.out.println("This number isn't a palindrome.");
    }
}

