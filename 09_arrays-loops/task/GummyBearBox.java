package task;

import java.util.Stack;
import java.util.stream.IntStream;

public class GummyBearBox {
    private final Stack<GummyBear> sweets = new Stack<>();

    public GummyBearBox(int capacity) {
        IntStream.range(0, capacity).forEach((num) -> sweets.push(new GummyBear()));
    }

    public boolean isEmpty() {
        return sweets.isEmpty();
    }

    public GummyBear takeSweet() {
        return sweets.pop();
    }
}

