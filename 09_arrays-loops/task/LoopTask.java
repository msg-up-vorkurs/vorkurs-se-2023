package task;

public class LoopTask {
    public static void main(String[] args) {
        System.out.println(forEachTask());
        System.out.println(forTask());
        System.out.println(whileTask());

        whileGummyBears();
    }

    public static double forEachTask() {
        double[] numbers = {20.0, 16.6, 13.3, 5.0, 0.1, 99.9};

        // TODO: Aufgabe 4: Berechne den Durchschnitt der Zahlen im Array. Verwende hierfür eine foreach-Schleife.
        return 0.0;
    }

    public static double forTask() {
        double[] numbers = {20.0, 16.6, 13.3, 5.0, 0.1, 99.9};

        // TODO: Aufgabe 5: Berechne den Durchschnitt der Zahlen im Array. Verwende hierfür eine for-Schleife.
        return 0.0;
    }

    public static double whileTask() {
        double[] numbers = {20.0, 16.6, 13.3, 5.0, 0.1, 99.9};

        // TODO: Aufgabe 6: Berechne den Durchschnitt der Zahlen im Array. Verwende hierfür eine while-Schleife.
        return 0.0;
    }

    public static void whileGummyBears() {
        GummyBearBox gummyBox = new GummyBearBox(200);

        // TODO: Aufgabe 7: Nehme solange Gummibärchen aus der Box, bis diese leer ist. Gib für jedes Gummibärchen auf der Konsole aus, welche Farbe es hat.
    }
}
