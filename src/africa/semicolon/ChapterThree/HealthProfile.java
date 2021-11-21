package africa.semicolon.ChapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private int age;

    public HealthProfile(String firstName, String lastName, String gender, int month,
                         int day, int year, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return 2021 - getYear();
    }

    public String getDateOffBirt() {
        String dateOffBirt = month + "/" + day + "/" + year;
        return dateOffBirt;
    }
}
