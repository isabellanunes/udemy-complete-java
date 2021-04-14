import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int userId, hoursWorked;
		float hoursValue, salary;
		
		Scanner scanner = new Scanner(System.in);
		
		userId = scanner.nextInt();
		hoursWorked = scanner.nextInt();
		hoursValue = scanner.nextFloat();
		
		salary = hoursWorked * hoursValue;
		
		System.out.println("NUMBER = " + userId);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		scanner.close();
	}

}
