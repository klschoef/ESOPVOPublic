package com.klausschoeffmann.Schleifen;

public class Quadratwurzel {
    public static void main(String[] args) {
        int x = 10;
        double root = (double)(x / 2);

        double a;
        for(a = (double)x / root; Math.abs(a - root) > 1.0E-6D; a = (double)x / root) {
            root = (root + a) / 2.0D;
        }

        System.out.println("Ergebnis: " + a);
    }
}
