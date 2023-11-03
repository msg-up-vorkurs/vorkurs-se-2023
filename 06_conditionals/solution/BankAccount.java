package solution;

public class BankAccount {

    int accountNumber;
    double balance;
    double overdraftLimit;

    public BankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    void printInfo() {
        System.out.println("Accountnumber: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("-----------------------");
    }


    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void transfer(double amount, BankAccount to) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    /*
     * TODO Aufgabe 1: calculateWithdrawlimit
     * Für das Auszahlungslimit wird sowohl der Kontostand als auch das Kreditlimit berücksichtigt
     */

    double calculateWithdrawLimit() {
        return this.balance + this.overdraftLimit;
    }

    /*
     * TODO Aufgabe 1: transferChecked
     * Vor jeder Überweisung soll sichergestellt werden,
     * ob der Betrag unter Einhaltung des Kreditlimits abgebucht werden kann.
     */

    void transferChecked(double amount, BankAccount to) {
        if (this.calculateWithdrawLimit() >= amount) {
            this.transfer(amount, to);
        } else {
            System.out.println("Überweisung fehlgeschlagen: Konto nicht ausreichend gedeckt.");
        }
    }















    public double currencyConvert(String targetCurrency) {
        switch (targetCurrency) {
            case "USD":
                return this.balance * 1.05;
            case "NOK":
                return this.balance * 11.49;
            case "LIRA":
                return this.balance * 29.17;
            case "PESO":
                return this.balance * 19.24;
            default:
                System.out.println("FEHLER: Währung unbekannt!");
                return -1;
        }
    }

    public double currencyConvertExpression(String targetCurrency) {
        return switch (targetCurrency) {
            case "USD" -> this.balance * 1.05;
            case "NOK" -> this.balance * 11.49;
            case "LIRA" -> this.balance * 29.17;
            case "PESO" -> this.balance * 19.24;
            default -> {
                System.out.println("FEHLER: Währung unbekannt!");
                yield -1;
            }
        };
    }
}
