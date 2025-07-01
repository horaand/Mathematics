# Java-Beispiel: Zwei Zahlen addieren
* Dieses einfache Java-Programm demonstriert, wie man zwei Zahlen addieren kann – einmal mit vordefinierten Werten und einmal über Benutzereingabe mit `Scanner`.

## code:
```
public class SumNumbers {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 8;
        int sum = num1 + num2;
        System.out.println(num1 + num2 + " = " + sum);

        //or
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein: ");

        int x = scanner.nextInt();

        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        
        int y = scanner.nextInt();

        int z = x + y;

        System.out.println(x + " + " + y + " = " + z);
    }
}

```

# Erklärung
1. <code style = "color : pink "> Feste Werte addieren: </code>
    * Die Zahlen `6` und `8` werden direkt im Code definiert.
    * Die Summe wird berechnet und ausgegeben.

2. <code style = "color : pink">Zahlen per Benutzereingabe addieren:</code>
    * Mit `Scanner` wird der Benutzer aufgefordert, zwei Zahlen einzugeben.
    * Diese werden eingelesen und anschließend addiert.
    * Das Ergebnis wird als Summe ausgegeben.

## Beispielausgabe
```
14 = 14
Bitte geben Sie die erste Zahl ein: 
> 3
Bitte geben Sie die zweite Zahl ein: 
> 5
3 + 5 = 8

```
Diese Übung basiert auf Aufgaben von [w3resource](https://www.w3resource.com/java-exercises/basic/index.php)  

Die Lösungen wurden selbstständig von mir entwickelt und sind nur für Lernzwecke gedacht.
