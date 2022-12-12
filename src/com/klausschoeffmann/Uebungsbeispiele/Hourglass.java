package com.klausschoeffmann.Uebungsbeispiele;

public class Hourglass {
    public static void main(String[] args) {
        //Test mit verschiedenen Längen (auch ungültigen)
        for (int l = -1; l <= 11; l+=2) {
            System.out.println("Länge " + l + ": ");
            print2DArray( createHourglass(l) );
        }
    }

    static void print2DArray(char[][] a) {
        for (char[] row : a) { //wir gehen Zeile für Zeile durch
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println(); //Zeilenumbruch nach jeder Zeile
        }
    }

    static char[][] createHourglass(int size) {
        char[][] arr;

        if (size < 1 || size % 2 == 0)
            arr = new char[0][0]; //wenn Länge ungültig wird ein leeres Array erzeugt (und die Schleife unten somit nicht durchlaufen)
        else
            arr = new char[size][size]; //wenn Länge ungerade, erzeugen wir eine quadratische Matrix (size x size)

        int offset = 0; //wie viele Leerzeichen zu Beginn (und Ende) der Zeile?
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) { //da die Matrix size x size groß ist, können wir hier nur arr.length verwenden (ansonsten arr[row].length)
                if (col >= offset && col <= arr.length - 1 - offset)
                    arr[row][col] = '*';
                else
                    arr[row][col] = ' ';
            }

            if (row < arr.length/2)
                offset++; //nach jeder Zeile ein Leerzeichen links und rechts MEHR (in oberer Hälfte der Matrix)
            else
                offset--; //nach jeder Zeile ein Leerzeichen links und rechts WENIGER (in unterer Hälfte der Matrix)
        }

        return arr;
    }
}
