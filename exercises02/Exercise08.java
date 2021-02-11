import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();

        double tax;

        if(salary <= 2000.00) {
            System.out.println("Isento");
        }

        else if(salary <= 3000.00) {
            tax = (salary - 2000.00) * 0.08;
            System.out.printf("R$ %.2f", tax);
        }

        else if(salary <= 4500.00) {
            tax = (salary - 3000.00) * 0.18 + (1000 * 0.08);
            System.out.printf("R$ %.2f", tax);
        }

        else {
            tax = ((salary - 4500.00) * 0.28) + (1500.0 * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f", tax);
        }

        scanner.close();

    }

}
