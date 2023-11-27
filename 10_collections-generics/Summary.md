# Listen (Collections)

- Listen (von Elementen) werden in der Software-Entwicklung häufig benötigt
- Übliche Features:
  - Elemente hinzufügen/löschen
  - Angabe, ob ein Element in der Liste enthalten ist
  - Anzahl der Elemente
  - Zugriff auf alle/einzelne Elemente

## Arrays-basierte Listen (Array List)

- Arrays können die Anforderungen einer Liste nur sehr eingeschränkt erfüllen.
- Insbesondere beim Hinzufügen/Löschen von Elementen muss eine (angepasste) Kopie des kompletten Arrays erstellt werden.
- Java stellt eine fertige Implementierung einer Liste basierend auf Arrays bereit: `ArrayList`

## Verkettete Listen (Linked List)

- Elemente einer verketteten Liste enthalten ihren zu speichernden Wert (Eintrag) und einen Verweis auf das jeweils
  nächste Element der Liste.
- Die Liste selbst enthält nur einen Verweis auf das erste Element der Liste.
- Durch diese Implementierung kann insbesondere das Einfügen von Elementen am
  Anfang der Liste sehr einfach realisiert werden.
- Java stellt eine fertige Implementierung einer verketteten Liste bereit: `LinkedList`

## Vergleich ArrayList / LinkedList

| Kriterium                     | ArrayList | LinkedList                              |
|-------------------------------|-----------|-----------------------------------------|
| Speicherverbrauch             | gering    | erhöht                                  |
| Zugriff auf einzelne Elemente | direkt    | aufwändig                               |
| Einfügen                      | aufwändig | einfach (am Anfang/Ende)                |
| Löschen                       | aufwändig | im Mittel effizienter als bei ArrayList |

# Generische Klassen: Generics

Um für unterschiedliche Datentypen nicht immer wieder neue Klassen mit nahezu ähnlichem Funktionsumfang implementieren
zu müssen, stellt Java die Möglichkeit bereit, Klassen mit "Typ-Parametern" zu versehen.
Der/die Typ-Parameter können innerhalb der Klasse als Datentyp verwendet werden, ohne dessen konkrete Ausprägung zu
kennen.

Durch welchen Datentyp dieser Typ-Parameter ersetzt werden soll, wird erst bei der Instantiierung der Klasse festgelegt. 

## Beispiel

## Implementierung einer Klasse mit Typ-Parameter '\<ElementType\>'

```java
public class LinkedList<ElementType> {
    
    private LinkedListElement<ElementType> first;

    public LinkedList(ElementType firstValue){
        this.first = new LinkedListElement<>(firstValue);
    }

    void add(ElementType value){
        this.first = new GenericLinkedListElement<>(value, this.first);
    }

    void print(){
        LinkedListElement<ElementType> current = first;
        System.out.println(current.getValue());

        while (current.hasNext()){
            current = current.getNext();
            System.out.println(current.getValue());
        }
    }
}
```

## Instantiierung einer Klasse mit Typ-Parameter

```java
LinkedList<String> namesList = new LinkedList<>("Anna");
namesList.add("Bob");
namesList.add("Chris");
namesList.print();

LinkedList<Integer> paymentsList = new LinkedList<>(500);
paymentsList.add(-300);
paymentsList.add(800);
paymentsList.print();
```