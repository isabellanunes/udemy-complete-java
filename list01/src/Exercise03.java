import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int a, b, c, d;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		System.out.printf("DIFERENCA = %d", ((a * b) - (c * d)));
		
		scanner.close();
    }
}