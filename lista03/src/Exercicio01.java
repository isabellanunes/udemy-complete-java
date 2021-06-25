import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPassword = 2002;

        int enteredPassword = scanner.nextInt();

        while(enteredPassword != correctPassword) {
            System.out.println("Senha Inválida");
            enteredPassword = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");

        scanner.close();
    }
}