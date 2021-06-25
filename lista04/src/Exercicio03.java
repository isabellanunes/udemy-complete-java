import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            double v1 = scanner.nextDouble();
            double v2 = scanner.nextDouble();
            double v3 = scanner.nextDouble();

            double mean = (v1 * 2 + v2 * 3 + v3 * 5) / 10.0;

            System.out.printf("%.1f%n", mean);
        }
        
        scanner.close();
    }
}