package exercise02;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] agrs) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.printf("Name: ");
        employee.name = scanner.nextLine();
        System.out.printf("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.printf("Tax: ");
        employee.tax = scanner.nextDouble();
        System.out.printf("\n");

        System.out.println("Employee: " + employee);
        System.out.printf("\n");

        System.out.printf("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        System.out.printf("\n");

        employee.IncreaseSalary(percentage);
        System.out.println("Updated data: " + employee);
        System.out.printf("\n");

        scanner.close();

    }

}
