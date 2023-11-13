package task;

public class ScopeErrors {
    String variable = "Das hier soll ausgegeben werden!";
    int zahl = 100;

    void task1(int zahl) {
        if (zahl < 100) {
            String message = "Die Zahl ist kleiner als 100!";
        } else {
            String message = "Die Zahl ist größer gleich 100!";
        }

        //System.out.println(message);
    }

    void task2() {
        String variable = "Das hier soll nicht ausgegeben werden!";
        System.out.println(variable);
    }

    void task3() {
        // Was wird ausgegeben?
        int a = 10;
        int b = a + zahl;

        int zahl = 10;

        int ergebnis = b + zahl;

        System.out.println(ergebnis);
    }

    public static void main(String[] args) {
        ScopeErrors serr = new ScopeErrors();
        // Beispiele können auf 'serr' aufgerufen werden.
    }
}
