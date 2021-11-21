package africa.semicolon.ChapterThree;

public class HealthProfileTest {
    public static void main(String[] args) {

        HealthProfile myHealthProfile = new HealthProfile("Joe", "James", "Male",
                12, 25, 1992, 28);

        int maxRange = (int) ((220 - myHealthProfile.getAge()) * 0.85);

        int weightInPounds = 20;
        int heightInInches = 10;
        double bmi;
        bmi = (weightInPounds * 70) / (heightInInches * heightInInches);


        System.out.printf("HealthProfile Name is: %s %s\n %s\n %s\n %f\n %d", myHealthProfile.getFirstName(),
                myHealthProfile.getLastName(), myHealthProfile.getGender(),
                myHealthProfile.getDateOffBirt(),bmi, maxRange);


    }
}
