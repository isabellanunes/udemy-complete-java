package challenge01;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		int a, b, c, d, diferenca;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		diferenca = ((a * b) - (c * d));
		
		System.out.println("DIFERENCA = " + diferenca);
		
		scan.close();

	}

}
