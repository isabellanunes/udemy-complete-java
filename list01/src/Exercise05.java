import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int product1, product2, quant1, quant2;
        float value1, value2;

        product1 = scanner.nextInt();
        quant1 = scanner.nextInt();
        value1 = scanner.nextFloat();

        product2 = scanner.nextInt();
        quant2 = scanner.nextInt();
        value2 = scanner.nextFloat();

        System.out.printf("VALOR A PAGAR: %f", ((quant1 * value1) + (quant2 * value2)));

        scanner.close();   
    }
}