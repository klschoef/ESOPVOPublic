package com.klausschoeffmann.Schleifen;

public class SummeZahlen {

    public static void main(String[] args) {
        int max = 10, sum = 0;

        for (int zahl=1; zahl <= max; zahl++) {
            System.out.println("zahl=" + zahl + " sum=" + sum);
            sum += zahl;
        }
        System.out.println(sum);
    }
}
