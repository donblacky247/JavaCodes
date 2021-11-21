package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class TempConverter {

    public static void main(String... arg)
    {
        double celsius;
        double fahrenheit;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in celsius");
        celsius = input.nextDouble();

        fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.printf("%f Celsius is %f in fahrenheit%n",celsius,fahrenheit);
    }
}
