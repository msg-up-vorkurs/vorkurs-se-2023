package solution;

public class ScopeErrors {
    String variable = "Das hier soll ausgegeben werden!";
    int zahl = 100;

    /**
     * Um von außerhalb des if-Codeblocks auf message zugreifen zu können,
     * muss diese auch außerhalb deklariert werden.
     */
    void task1(int zahl) {
        String message = "";
        if (zahl < 100) {
            message = "Die Zahl ist kleiner als 100!";
        } else {
            message = "Die Zahl ist größer gleich 100!";
        }

        System.out.println(message);
    }

    /**
     * Bei einer Instanzvariable und einer lokalen Variable mit gleichem Namen
     * hat die lokale Variable Vorrang, die Instanzvariable muss in diesem Fall
     * über "this" referenziert werden.
     **/
    void task2() {
        String variable = "Das hier soll nicht ausgegeben werden!";
        System.out.println(this.variable);
    }

    void task3() {
        // Was wird ausgegeben?
        int a = 10;
        int b = a + zahl; //b = 110
        //sauberer: this.zahl - vermeidet Verwirrungen

        int zahl = 10;

        int ergebnis = b + zahl; //ergebnis = 120

        System.out.println(ergebnis);
    }

    public static void main(String[] args) {
        ScopeErrors serr = new ScopeErrors(); // Beispiele können auf 'serr' aufgerufen werden.
        serr.task1(5);
        serr.task2();
        serr.task3();
    }
}
