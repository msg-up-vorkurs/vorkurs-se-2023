package solution;

public class ConfidentialBankAccount {
    private int accountNumber;
    private double balance;
    private double overdraftLimit;

    public ConfidentialBankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.overdraftLimit = 0.0;
    }

    public void deposit(double balance) {
        this.balance = this.balance + balance;
    }

    public void withdraw(double balance) {
        this.balance = this.balance - balance;
    }

    public void transfer(ConfidentialBankAccount other, double amount) {
        this.withdraw(amount);
        other.deposit(amount);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
