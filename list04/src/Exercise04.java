import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();

            if(v2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                double result = (double) v1/v2;
                System.out.printf("%.1f%n", result);
            }
        }

        scanner.close();
    }
}