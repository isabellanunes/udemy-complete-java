import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", ((a * c)/2));
        System.out.printf("CIRCULO: %.3f%n", (3.14159 * (Math.pow(c, 2))));
        System.out.printf("TRAPEZIO: %.3f%n", (((a + b) / 2) * c));
        System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
        System.out.printf("RETANGULO: %.3f%n", a * b);

        scanner.close();
    }
}