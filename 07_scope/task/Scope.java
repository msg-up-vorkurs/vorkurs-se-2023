package task;
public class Scope {

    int x = 42; //Instanzvariable 'x'

    void classLevelScope() {
        System.out.println(x); //Was wird ausgegeben?
    }

    void classLevelScope2() {
        // Lokale Variable x trotz gleichnamiger Instanzvariable möglich
        int x = 1;
        System.out.println(x); //Was wird ausgegeben?

        // Auf Instanzvariable "x" kann via "this" zugegriffen werden.
        System.out.println(this.x);
    }

    void methodLevelScope(int x) {
        System.out.println(x); //Was wird ausgegeben?
    }

    void blockLevelScope(int zahl) {
        //String message = "Mir ist die Zahl egal";
        if (zahl < 100) {
           //String message = "Die Zahl war kleiner als 100!";
        }

        //System.out.println(message); //Was wird ausgegeben?
    }
    public static void main(String[] args) {
        Scope s = new Scope();
        // Beispiele können auf 's' aufgerufen werden.

        //Beispiel 1
        s.classLevelScope();
        //Beispiel 2
        s.classLevelScope2();
        //Beispiel 3
        s.methodLevelScope(5);
        //Beispiel 4
        s.blockLevelScope(5);
    }
}
