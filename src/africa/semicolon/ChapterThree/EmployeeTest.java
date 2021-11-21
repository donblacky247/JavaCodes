package africa.semicolon.ChapterThree;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Obi", "Michael", 100_000.00);
        Employee emp2 = new Employee("James", "Smith", 50_000.00);

        System.out.printf("%s's yearly salary is %.2f%n", emp1.getFirstName(), emp1.getMonthlySalary() * 12);
        System.out.printf("%s's yearly salary is %.2f%n", emp2.getFirstName(), emp2.getMonthlySalary() * 12);

        System.out.println();

        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.printf("%s's yearly salary after 10%% raise is %.2f%n", emp1.getFirstName(), emp1.getMonthlySalary() * 12);
        System.out.printf("%s's yearly salary after 10%% is %.2f%n", emp2.getFirstName(), emp2.getMonthlySalary() * 12);

    }
}
