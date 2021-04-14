import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for(int i = 0; i <= x; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();

    }
    
}
