package exercise07;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void deposit(double deposit) {
        this.accountBalance += deposit;
    }

    public void withdraw(double withdraw) {
        this.accountBalance = this.accountBalance - withdraw - 5.00;
    }

    public String toString() {
        return  "Account " + getAccountNumber() +
                ", Holder: " + getAccountHolder() +
                ", Balance: $ " + String.format("%.2f", getAccountBalance());
    }
}