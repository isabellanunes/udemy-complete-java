package challenge01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        int product1, product2, quant1, quant2;
        float value1, value2;

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        product1 = scan.nextInt();
        quant1 = scan.nextInt();
        value1 = scan.nextFloat();

        product2 = scan.nextInt();
        quant2 = scan.nextInt();
        value2 = scan.nextFloat();

        float total = (quant1 * value1) + (quant2 * value2);

        System.out.println("VALOR A PAGAR: " + total );

    }

}
