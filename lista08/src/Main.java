import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        boolean hasId = true;

        System.out.print("How many employees will be registered? ");
        int x = scanner.nextInt();
        
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < x; i++) {

            if (employees.isEmpty()) {
                System.out.println();
                System.out.printf("Employee #%d\n", i+1);

                System.out.printf("Id: ");
                Integer id = scanner.nextInt();

                scanner.nextLine();
                System.out.printf("Name: ");
                String name = scanner.nextLine();
                
                System.out.printf("Salary: ");
                Double salary = scanner.nextDouble();

                employees.add(new Employee(id, name, salary));
                
            } else {

                System.out.println();
                System.out.printf("Employee #%d\n", i+1);

                System.out.printf("Id: ");
                Integer id = scanner.nextInt();
                
                while(hasId == true) {
                    for (Employee reg : employees) {
                        if(reg.getId() == id) {
                            System.out.printf("This Id already exists, type another one: ");
                            id = scanner.nextInt();
                            break;
                        } else {
                            hasId = false;
                        }
                    }
                
                }

                scanner.nextLine();
                System.out.printf("Name: ");
                String name = scanner.nextLine();
                
                System.out.printf("Salary: ");
                Double salary = scanner.nextDouble();

                employees.add(new Employee(id, name, salary));
            }

        }

        System.out.printf("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();
        hasId = false;

        for (Employee reg : employees) {
            if(reg.getId() == id) {
                hasId = true;
            }
        }

        if(hasId == true) {
            System.out.printf("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            for (Employee reg : employees) {
                if(reg.getId() == id) {
                    reg.increaseSalary(percentage);
                }
            }
        } else {
            System.out.println("This id does not exist!");
            System.out.println();
        }

        System.out.println("List of employees:");
        for (Employee reg : employees) {
            System.out.println(reg);
        }

        scanner.close();
    }
}