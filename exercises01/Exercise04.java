import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int userId, hoursWorked;
		float hoursValue, salary;
		
		Scanner scan = new Scanner(System.in);
		
		userId = scan.nextInt();
		hoursWorked = scan.nextInt();
		hoursValue = scan.nextFloat();
		
		salary = hoursWorked * hoursValue;
		
		System.out.println("NUMBER = " + userId);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		scan.close();
	}

}
