# Methoden
Methoden sind Codeblöcke, die bestimmte Aufgaben ausführen oder Funktionalitäten bereitstellen und in Klassen definiert werden, um wiederverwendbare Funktionen innerhalb eines Programms zu ermöglichen. Sie können Parameter erhalten und einen Rückgabewert liefern. Falls die Methode keinen Rückgabewert liefert, wird sie mit dem Rückgabetyp `void` spezifiziert.

## Merkmale
Methoden ...
* ... dienen dazu, den Quellcode besser zu strukturieren und ggf. Wiederverwendung zu ermöglichen.
* ... definieren eine Sequenz auszuführender Anweisungen.
* ... werden in Klassen definiert und legen so das Verhalten/Logik/Algorithmen von Objekten fest.
* ... können von anderen Methoden aufgerufen werden.

## Bestandteile einer Methode
* Name
* Sequenz auszuführender Anweisungen (Methodenrumpf)
* Rückgabetyp (**Datentyp** oder **void**)
* ggf. Rückgabeanweisung
* ggf. Parameterliste

```
  <Rückgabetyp> <Name> (>Parameterliste>) {
    <Methodenrumpf>
  }
```

Wenn die Methode einen Rückgabetyp hat, muss das Ergebnis der Berechnung/Ausführung mit der `return`-Anweisung zurückgegeben werden.

```
  <Rückgabetyp> <Name> (>Parameterliste>) {
    ..
    return <Rückgabewert>;
  }
```

## Aufruf einer Methode
Der Aufruf einer Methode erfolgt immer mit Bezug auf das Objekt, dessen Klasse die Methode definiert.
``` 
    1. Person bob = new Person("Bob", "Doe", 26);
    2. bob.sayHello(); // Ausgabe: "Hello, my name is Bob Doe!"
    3. double bmi = bob.calculateBMI(); // Speichert das Ergebnis von "calculateBMI" in der Variable "bmi"
```

## Beispiele für Methoden

### Parameterlose Methode ohne Rückgabewert:
```
public void sayHello() {
    System.out.println("Hello, my name is " + this.fullName() + " and I am " + this.age + " years old.");
}
```
Besonderheit: Diese Methode hat keine Parameter und gibt keinen Wert zurück (`void`).
Sie gibt lediglich eine Begrüßungsnachricht auf der Konsole aus.

### Parameterlose Methode mit Rückgabewert:
```
public float calculateBMI() {
    return this.weight / (this.height * this.height);
}
```
Besonderheit: Diese Methode hat keine Parameter, gibt jedoch einen Rückgabewert (`float`) zurück.

### Methode mit Parametern und Rückgabewert:
```
public int calculateSum(int a, int b) {
    return a + b;
}
```
Besonderheit: In diesem Beispiel akzeptiert die Methode `calculateSum` zwei Parameter (`a` und `b`),
addiert sie und gibt die Summe als Rückgabewert (`int`) zurück.
Die Methode nimmt zwei ganze Zahlen als Eingabe und gibt eine ganze Zahl als Ergebnis zurück.
