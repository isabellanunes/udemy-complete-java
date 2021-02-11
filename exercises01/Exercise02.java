import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double area, raio, pi = 3.14159;
		
		raio = scan.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.printf("A=%.4f%n", area);
		
		scan.close();
	}

}
