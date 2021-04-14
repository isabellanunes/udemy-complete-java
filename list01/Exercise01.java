import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, sum;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		sum = a + b;
		
		System.out.println("SOMA = " + sum);
		
		scanner.close();

	}

}
