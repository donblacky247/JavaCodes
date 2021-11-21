package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Body Mass Index Calculator");
        System.out.print("Enter Weight (kg): ");
        double weight = userInput.nextDouble();

        System.out.print("Enter Height (m): ");
        double height = userInput.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("%nYour BMI is %.2fkg/m2%n%n", bmi);

        System.out.println("BMI VALUES\n" +
                "Underweight: less than 18.5\n" +
                "Normal: between 18.5 and 24.9\n" +
                "Overweight: between 25 and 29.9\n" +
                "Obese: 30 or greater");
    }
}
