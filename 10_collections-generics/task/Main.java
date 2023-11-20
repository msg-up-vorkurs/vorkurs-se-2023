package task;

public class Main {
    public static void main(String[] args) {
        ArrayStringList arrayList = new ArrayStringList();
        arrayList.add("Bread");
        arrayList.add("Butter");
        arrayList.add("Marmelade");
        arrayList.add("Chips");

        System.out.println("Is marmelade on the list? " + arrayList.contains("Marmelade"));
        arrayList.print();

        System.out.println("----");

        LinkedStringList linkedList = new LinkedStringList("Bread");
        linkedList.add("Butter");
        linkedList.add("Marmelade");
        linkedList.add("Chips");
        linkedList.print();
    }
}
