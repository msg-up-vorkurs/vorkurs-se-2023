package solution;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        /* TODO Aufgabe 1: Deklariere und Initialisiere ein 2D-Array mit folgenden Werten
        *
        * 1  | 3  | 5  | 7
        * 2  | 4  | 6  | 8
        * 11 | 13 | 15 | 17
        * 12 | 14 | 16 | 18
        *
        */

        int[][] numbers = {
                { 1,  3,  5,  7},
                { 2,  4,  6,  8},
                {11, 13, 15, 17},
                {12, 14, 16, 18},
        };


        // TODO Aufgabe 2: Berechne mit einer foreach-Schleife die Summe der ersten Reihe

        int firstRowSum = 0;
        for (int number : numbers[0]) {
            firstRowSum = firstRowSum + number;
        }
        System.out.println("Summe der ersten Reihe: " + firstRowSum);


        // TODO Aufgabe 3: Berechne mit einer foreach-Schleife die Summe der ersten Spalte

        int firstColumnSum = 0;
        for (int[] row : numbers) {
            firstColumnSum = firstColumnSum + row[0];
        }
        System.out.println("Summe der ersten Spalte: " + firstColumnSum);


        // TODO Aufgabe 4: Berechne mit einer foreach-Schleife die Summe aller Werte im 2D-Array

        int overallSum = 0;
        for (int[] row : numbers) {
            for (int number : row) {
                overallSum = overallSum + number;
            }
        }
        System.out.println("Summe aller Werte im 2D-Array: " + overallSum);


        // TODO Aufgabe 5: Berechne mithilfe einer for-Schleife die Summe der Diagonale von links-oben nach rechts-unten

        int leftDiagonalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j) {
                    leftDiagonalSum = leftDiagonalSum + numbers[i][j];
                }
            }
        }
        System.out.println("Summe der Diagonale: " + leftDiagonalSum);


        // TODO Aufgabe 6: Vertausche im 2D-Array die erste Reihe mit der Letzten und überprüfe den Austausch
        //  durch die Ausgabe der Werte in der ersten Reihe des 2D-Arrays

        int[] firstRow = numbers[0];
        numbers[0] = numbers[3];
        numbers[3] = firstRow;

        System.out.println("Array nach der");
        for (int[] row : numbers) {
            System.out.println(Arrays.toString((row)));
        }
    }
}
