package solution;


public class BankApplication {
    public static void main(String[] args) {
        ConfidentialBankAccount aliceAccount = new ConfidentialBankAccount(1);
        ConfidentialBankAccount bobAccount = new ConfidentialBankAccount(2);

        aliceAccount.deposit(2000.0);
        aliceAccount.transfer(bobAccount, 500.0);

        System.out.println("Balance of Alice's account: " + aliceAccount.getBalance());
        System.out.println("Balance of Bob's account: " + bobAccount.getBalance());
    }
}
