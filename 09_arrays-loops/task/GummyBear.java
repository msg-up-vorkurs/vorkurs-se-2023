package task;

import java.util.Random;

public class GummyBear {
    private static final Random rand = new Random(42);
    static String[] colors = {"WHITE", "RED", "ORANGE", "GREEN"};

    String color;

    public GummyBear() {
        color = colors[Math.abs(rand.nextInt()) % colors.length];
    }

    public String getColor() {
        return color;
    }
}
