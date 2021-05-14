import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcohol = 0, gasoline = 0, diesel = 0;

        int input = scanner.nextInt();

        while(input != 4) {
            if(input == 1) {
                alcohol += 1;
            } else if(input == 2) {
                gasoline += 1;
            } else if(input == 3) {
                diesel += 1;
            }

            input = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}