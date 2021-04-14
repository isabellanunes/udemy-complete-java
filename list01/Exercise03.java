import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		int a, b, c, d, diferenca;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		diferenca = ((a * b) - (c * d));
		
		System.out.println("DIFERENCA = " + diferenca);
		
		scanner.close();

	}

}
