package challenge01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, sum;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		sum = a + b;
		
		System.out.println("SOMA = " + sum);
		
		scan.close();

	}

}
