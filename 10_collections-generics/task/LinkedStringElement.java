package task;

public class LinkedStringElement {
    private String value;
    private LinkedStringElement next;

    public LinkedStringElement(String value) {
        this.value = value;
    }

    public LinkedStringElement(String value, LinkedStringElement next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public LinkedStringElement getNext() {
        return next;
    }

    public boolean hasNext() {
        if (this.next == null) {
            return false;
        } else {
            return true;
        }
    }
}
