import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = 0, out = 0;

        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++) {
            int read = scanner.nextInt();

            if((read >= 10) && (read <= 20)) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out", out);

        scanner.close();
    }
}