import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.printf("How many employee will be regisered? ");
        int n = scanner.nextInt();
        System.out.println();

        for(int i = 0; i < n; i++) {
            System.out.println("Employee #" + i + 1 + ":");
            System.out.print("Id: ");
            


        }

        scanner.close();

        
    
    }
}