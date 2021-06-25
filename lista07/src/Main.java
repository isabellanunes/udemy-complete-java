import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number;
        String holder;
        double deposit, withdraw;
        char option;
        Account account;
        
        System.out.print("Enter account number: ");
        number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        scanner.nextLine();
        holder = scanner.nextLine();

        do{
            System.out.print("Is there an initial deposit (y/n)? ");
            option = scanner.next().charAt(0);
        } while((option != 'y') && (option != 'n'));
        
        if(option == 'y') {
            System.out.print("Enter initial deposit value: ");
            deposit = scanner.nextDouble();
            account = new Account(number, holder, deposit);
            System.out.printf("%nAccount data:%n");
            System.out.println(account);

        } else {
            account = new Account(number, holder);
            System.out.printf("%nAccount data:%n");
            System.out.println(account);
        }

        System.out.printf("%nEnter a deposit value: ");
        deposit = scanner.nextDouble();
        account.deposit(deposit);
        System.out.printf("%nUpdated account data:%n");
        System.out.println(account);

        System.out.printf("%nEnter a withdraw value: ");
        withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
        System.out.printf("%nUpdated account data:%n");
        System.out.println(account);

        scanner.close();
    }
}