import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double interval = scanner.nextDouble();

        if((interval >= 0) && (interval <= 25.00)) {
            System.out.println("Intervalo (0, 25)");

        } else if((interval >= 25.00) && (interval <= 50.00)) {
            System.out.println("Intervalo (25, 50)");

        } else if((interval >= 50.00) && (interval <= 75.00)) {
            System.out.println("Intervalo (50, 75)");

        } else if((interval >= 75.00) && (interval <= 100.00)) {
            System.out.println("Intervalo (75, 100)");

        } else {
            System.out.println("Fora de intervalo");
        }

        scanner.close();
    }
}