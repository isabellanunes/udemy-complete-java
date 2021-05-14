package exercise01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How mnay dollars will be bought? ");
        double quantityOfDollars = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.finalValue(dollarPrice, quantityOfDollars));

        scanner.close();
    }   
}