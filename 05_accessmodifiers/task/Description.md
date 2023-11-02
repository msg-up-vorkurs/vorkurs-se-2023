# Aufgaben zu Session05

## Aufgabe 1: Bankkonto Sichtbarkeitsmodifikatoren

Das Bankkonto soll von Veränderungen von außen geschützt werden. Führen Sie folgende Anpassungen in der Klasse **ConfidentialBankAccount** aus.

* Da die *accountNumber* für ein Konto immer gleich bleiben soll, soll die Deklaration so angepasst werden, damit sie von außen nicht mehr Sichtbar ist. Damit sie trotzdem noch ausgelesen werden kann, soll eine Getter Methode hinzugefügt werden.
* *balance* soll von außen nur noch über die bereits implementierten Methoden verändert werden dürfen. Passen Sie die Deklaration an und erstellen Sie eine Methode, die das Auslesen des Kontostands erlaubt.
* Auf die Variable *overdraftLimit* soll ebenfalls nicht direkt zugegriffen werden dürfen. Passen Sie die Deklaration entsprechend an und erstellen Sie eine *Getter* und eine *Setter* Methode für diese Variable.



