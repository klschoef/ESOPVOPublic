package com.klausschoeffmann.Methoden;

public class Sichtbarkeit {
    static int sum = 0;

    static void add(int x) {
        int sum = 0;
        sum = sum + x;
    }

    public static void main(String[] args) {
        add(3);
        add(17);
        add(5);
        //...
        System.out.println(sum);
    }
}
