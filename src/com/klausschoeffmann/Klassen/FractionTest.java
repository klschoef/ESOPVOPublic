package com.klausschoeffmann.Klassen;

public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        //f1.denominator = 0;
        f1.setDenominator(0);
        System.out.println(f1.getNumerator());
        System.out.println(f1);
        System.out.println(f1.toDouble());
    }
}
