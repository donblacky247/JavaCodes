package africa.semicolon.ChapterTwo;

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double population;
        double annual;
        double one;
        double two;
        double three;
        double four;
        double five;
        System.out.printf("Enter world population number");
        population = input.nextDouble();
        System.out.printf("Enter world annual number");
        annual = input.nextDouble();
        one = population * annual;
        two = population * annual * annual;
        three = population * annual * annual * annual;
        four = population * annual * annual * annual * annual;
        five = population * annual * annual * annual * annual * annual;
        System.out.printf(" estimated world population: %f\n%f\n%f\n%f\n%f", one, two, three, four, five);



    }
}
