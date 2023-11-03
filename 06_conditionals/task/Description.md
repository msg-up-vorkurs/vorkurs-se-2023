# Aufgaben zu Verzweigungen 

## Aufgabe 1: Bankkonto Verzweigung

Bei der aktuellen Implementierung von *transfer* wird die Überweisung ohne Rücksicht auf das Kreditlimit des Bankkontos durchgeführt. Um die Überweisung nur dann durchzuführen, wenn es der Kontostand und das Kreditlimit erlauben, soll eine neue Methode **transferChecked** in der Klasse **BankAccount** angelegt werden.
Um die Methode **transferChecked** einfacher implementieren zu können, legen Sie zunächst die Methode **calculateWithdrawLimit** an, die das Auszahlungslimit des Kontos berechnet und zurückgibt.

Implementieren Sie diese Methode mithilfe von bedingten Verzweigungen.

## Aufgabe 2: Verschachtelte Verzweigungen

Mithilfe von einfachen Regeln sollen schon vor den aufwendigen und genauen Kreditprüfungen die Anträge aussortiert werden.

Um einen Kredit zu erhalten, muss die antragstellende Person einen Wohnsitz in Deutschland angemeldet haben, volljährig sein und über ein geregeltes Einkommen verfügen. Zusätzlich muss eine Bonitätsbewertung von mindestens 70 vorliegen. Bei einer Kreditsumme von über 100.000€ darf die Bewertung nicht unter 80 liegen.

Die **rateCredit** Methode in der **Bank** Klasse soll anhand dieser Regeln bewerten, ob ein Kredit infrage kommt oder nicht. Kommt ein Kredit infrage, soll die Methode *true* zurückgegeben, andernfalls *false*.


**Erweiterung der Regeln:**
Ab dem frühestmöglichen Renteneintrittsalter (hier vereinfacht das 63. Lebensjahr) wird zusätzlich eine für die Kreditsumme ausreichende Sicherheit gefordert, um einen Kredit zu erhalten.
Passen Sie die Methode **rateCredit** an, damit diese auch die neue Regel berücksichtigt.

## Aufgabe 3: Währungskonvertierung
Ein Bankkonto ist in mehreren Währungsregionen gültig. Um einen besseren Überblick über die Preise im Ausland zu bekommen, soll der Kontostand in verschiedene ausländische Währungen umgerechnet werden können. Die Währung des Kontos liegt derzeit in "Euro" vor.

Implementieren Sie eine Methode `public double currencyConvert(String targetCurrency)` in der Klasse `BankAccount`. Diese Methode akzeptiert einen String, welcher die Zielwährung definiert. Die folgenden Wechselkurse sollen unterstützt werden:

| **Währung** | **Wechselkurs**    |
|-------------|--------------------|
| USD         | 1 EUR = 1,05 USD   |
| NOK         | 1 EUR = 11,49 NOK  |
| LIRA        | 1 EUR = 29,17 LIRA |
| PESO        | 1 EUR = 19,24 PESO |

Verwenden Sie für die Implementierung ein `switch`-Konstrukt. Bei Angabe einer nicht-aufgelisteten Währung soll eine Fehlermeldung angezeigt werden. Die Funktion soll dann `-1` als Wert zurückgeben.

Bonusaufgabe: Implementieren Sie die gleiche Funktion unter Verwendung einer switch-Expression.