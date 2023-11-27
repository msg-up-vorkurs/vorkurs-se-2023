package solution;

import task.BankAccount;

public class ArrayTask {

    public static void main(String[] args) {
        createArray();
        System.out.println(arrayAccess());
        arrayModification();
    }

    private static void createArray() {
        // Mit Initializer
        int[] numbers = {1, 42, 2012, 11};
        String[] strings = {"Hallo", "Welt", "das", "ist", "ein", "Test!"};
        BankAccount[] accounts = {
                new BankAccount(39283, 1000.0, 1000.0),
                new BankAccount(12345, 10000.0, 0.0),
                new BankAccount(95493, 500.0, 1500.0)
        };

        // Ohne Initializer
        int[] numbers2 = new int[4];
        numbers2[0] = 1;
        numbers2[1] = 42;
        numbers2[2] = 2012;
        numbers2[3] = 11;

        String[] strings2 = new String[7];
        strings2[0] = "Hallo";
        strings2[1] = "Welt";
        strings2[3] = "das";
        strings2[4] = "ist";
        strings2[5] = "ein";
        strings2[6] = "Test!";

        BankAccount[] accounts2 = new BankAccount[3];
        accounts2[0] = new BankAccount(39283, 1000.0, 1000.0);
        accounts2[1] = new BankAccount(12345, 10000.0, 0.0);
        accounts2[2] = new BankAccount(95493, 500.0, 1500.0);
    }

    private static double arrayAccess() {
        double[] numbers = {100.0, 52.0, 28.5, 40.2, 5.5};
        return (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]) / numbers.length;
    }

    private static void arrayModification() {
        String[] greeting = {"Hallo,", "mein", "Name", "ist", "Java", "!"}; // Nicht verändern!

        greeting[4] = "Daniel";

        System.out.println(String.join(" ", greeting)); // Nicht verändern!
    }
}
