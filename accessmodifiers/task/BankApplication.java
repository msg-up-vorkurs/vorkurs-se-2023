package task;

public class BankApplication {
    public static void main(String[] args) {
        ConfidentialBankAccount aliceAccount = new ConfidentialBankAccount(1);
        ConfidentialBankAccount bobAccount = new ConfidentialBankAccount(2);

        aliceAccount.deposit(2000.0);
        aliceAccount.transfer(bobAccount, 1000.0);
    }
}
