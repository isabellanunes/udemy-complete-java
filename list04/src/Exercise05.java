import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);

        scanner.close();
    }
}