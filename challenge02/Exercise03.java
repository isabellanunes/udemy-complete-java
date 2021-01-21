import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        int a, b;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        if((a % b == 0) || (b % a == 0)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }

        scanner.close();

    }

}
