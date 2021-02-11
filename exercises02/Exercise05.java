import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int code, quant;
        double pay;

        Scanner scan = new Scanner(System.in);

        code = scan.nextInt();
        quant = scan.nextInt();

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

        scan.close();

    }
}
