# Vererbung
Vererbung erlaubt uns, gemeinsame Attribute und Methoden in eine Elternklasse auszulagern, die dann von allen Kindklassen geteilt werden.

Die Klassen stehen dann zueinander in einer "ist ein"-Beziehung (Bsp.: Ein Lehrer ist eine Person). Eine Kindklasse ist dabei immer eine Spezialisierung der Elternklasse, und kann dadurch als Instanz der Elternklasse behandelt werden.

Beispiel:
Erben die Klassen `Circle` und `Rectangle` von einer Klasse `Shape`, können wir Instanzen von `Circle` und `Rectangle` in einem `Shape[]`-Array mischen.

## Implementierung der Vererbungshierarchie

### Syntax
Das Schlüsselwort `extends` gibt an, von welcher Klasse geerbt werden soll. Die Attribute und Methoden der Basisklasse stehen dadurch in der abgeleiteten Unterklasse zur Verfügung.

**Beispiel**:
Von der Basisklasse `Person`
```java
public class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void celebrateBirthday() {
        this.age = this.age + 1;
    }
}
```
wird eine Unterklasse `Student` abgeleitet: 
```java
public class Student extends Person {
    int currentSemester;
}
```
Die Klasse `Student` erbt von `Person` und ist damit eine Spezialisierung der Basisklasse `Person`.
Damit verfügt ein `Student` auch über `name`, `surname` und `age`. Ebenso kann das Alter eines Objekts `student` über `student.celebrateBirthday()` erhöht werden.
`Student` enthält aber als Ergänzung zur Person noch ein Attribut `currentSemester`.

## Besonderheit Konstruktor
Für die abgeleitete Klassen müssen eigene Konstruktoren erstellt werden.
Dabei kann der Konstruktor der Oberklasse über das Schlüsselwort `super` aufgerufen werden.
Im Anschluss können die zusätzlichen Attribute initialisiert werden.

Beispiel:

```java
public class Student extends Person {
    int currentSemester;

    public Student(String name, String surname, int age, int currentSemester) {
        super(name, surname, currentSemester);
        this.currentSemester = currentSemester;
    }
}
```

## Überladen von Methoden
Methoden der Basisklasse können in der abgeleiteten Klasse überladen werden, indem eine gleichnamige Methode mit der exakt gleichen Signatur implementiert wird.

Üblicherweise wird dazu die Annotation `@Override` benutzt. In der überschriebenen Methode kann über das Schlüsselwort `super` auf die Methode der Basisklasse zugegriffen werden.

Beispiel: Die Basisklasse
```java
public class Person {
    
    public void sayHello() {
        System.out.println("Hello!");
    }
}
```
mit der abgeleiteten Klasse 
```java
public class Student extends Person {
    
    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("I'm a student.");
    }
}
```
führt bei Aufruf der Methode `sayHello` auf einem `Student`-Objekt zu folgender Ausgabe:
```
Hello!
I'm a student.
```
