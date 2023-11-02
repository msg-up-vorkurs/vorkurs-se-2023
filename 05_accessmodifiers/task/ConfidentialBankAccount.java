package task;

public class ConfidentialBankAccount {


    int accountNumber;
    double balance;
    double overdraftLimit;

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
}