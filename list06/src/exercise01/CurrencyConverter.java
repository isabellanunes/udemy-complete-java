package exercise01;

public class CurrencyConverter {
    
    public static double finalValue(double dollarPrice, double quantityOfDollars) {
        return (dollarPrice * quantityOfDollars) * 106 / 100;
    }
}