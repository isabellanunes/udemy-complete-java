import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.printf("SOMA = %d", x + y);

        scanner.close();
    }
}