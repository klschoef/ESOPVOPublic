package com.klausschoeffmann.Schleifen;

public class Break {
    public static void main(String[] args) {

        /* dieser Code zeigt ein schlechtes Beispiel
           für die Verwendung von breaks, da man hier
           mehrere Ausstiegspunkte aus der Schleife hat!
         */
        for (int i=10; i <= 100; i+=10) {
            if (i == 30)
                break;
            System.out.println(i);
            if (i >= 10)
                break;
        }

    }
}
