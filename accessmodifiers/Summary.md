# Cheatsheet Sichtbarkeiten
## Sichtbarkeiten
### Sichtbarkeitsmodifier

"Datenkapselung" (oder "Geheimnisprinzip") bedeutet, dass der Lese- und Schreibzugriff auf in Klassen gehaltenen Daten nicht direkt, sondern über zuvor definierte Schnittstellen erfolgen soll.

Die Möglichkeit zum direkten Zugriff auf Klassen, Variablen und Methoden kann in Java mittels verschiedener Schlüsselwörter gesteuert werden:

| Schlüsselwort | Bedeutung                                                                                                                                                                           |
|---------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| public        | Die Klasse, Variable oder Methode ist öffentlich, d.h. von überall aus sichtbar und aufrufbar.                                                                                      |
| private       | Die Klasse, Variable oder Methode ist privat. Sie kann nur innerhalb der Klasse aufgerufen werden. Von anderen Klassen sind sie weder sicht- noch aufrufbar.                        |

**Beispiel Bankkonto:**

Ein Bankkonto hat einen Kontostand, der nicht von außen manipuliert werden soll. Stattdessen sollen zum Geldtransfer ausschließlich die Methoden `withdraw(double amount)` und `deposit(double amout)` verwendet werden. Der direkte Zugriff auf den Kontostand von außen kann mit `private` unterbunden werden.

**BankAccount.java:**
```java
public class BankAccount {
    private double balance;
    private double overdraftLimit;

    public BankAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        ...
    }

    public void deposit(double amount) {
        ...
    }
}
```
**Application.java:**
```java
public class Application {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        account.withdraw(5000.0); // Kontostand ist jetzt 0.0

        // Compiler wirft hier Fehler.
        // "balance"-Variable ist "private", d.h. nicht von
        // der Application-Klasse aus sichtbar.
        konto.balance = 5000.0; 
    }
}
```

### Getter
Um mit `private` markierte Variablen trotzdem lesbar zu machen, gibt es in Java Getter. Getter sind einfache, typischerweise mit `public` markierte Methoden, die den Wert einer Variable zurückgeben. Der Rückgabetyp ist dabei immer gleich mit dem der Variable. Konventionell werden Getter nach folgendem Schema benannt:

"get", gefolgt vom Variablennamen in [Camel Case](https://de.wikipedia.org/wiki/Binnenmajuskel).

**Beispiel:**

```java
public double getBalance() {
    return this.balance;
}
```

### Setter
Um mit `private` markierte Variablen schreibbar zu machen, gibt es in Java Setter. Setter sind - wie Getter - typischerweise mit `public` markierte Methoden. Sie unterscheiden sich dadurch von Gettern, dass sie keine Variablen lesen, sondern schreiben. Der Rückgabetyp der Methode ist dabei `void`. Zudem besitzt ein Setter genau einen Parameter: Den zu setzenden Wert für die Variable innerhalb der Instanz. Konventionell werden Setter nach folgendem Schema benannt:

"set", gefolgt vom Variablennamen in [Camel Case](https://de.wikipedia.org/wiki/Binnenmajuskel).

**Beispiel:**

```java
public double setOverdraftLimit(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
}
```
