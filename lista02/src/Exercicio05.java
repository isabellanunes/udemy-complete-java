import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int code, quant;
        double pay;

        code = scanner.nextInt();
        quant = scanner.nextInt();

        if(code == 1) {
            pay = 4.00 * quant;
            System.out.printf("Total: R$ %.2f", pay);
        } if(code == 2) {
            pay = 4.50 * quant;
            System.out.printf("Total: R$ %.2f", pay);
        } if(code == 3) {
            pay = 5.00 * quant;
            System.out.printf("Total: R$ %.2f", pay);
        } if(code == 4) {
            pay = 2.00 * quant;
            System.out.printf("Total: R$ %.2f", pay);
        } if(code == 5) {
            pay = 1.50 * quant;
            System.out.printf("Total: R$ %.2f", pay);
        }

        scanner.close();
    }
}