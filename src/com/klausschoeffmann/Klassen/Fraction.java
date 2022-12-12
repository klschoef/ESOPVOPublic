package com.klausschoeffmann.Klassen;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int n, int d) {
        this.setNumerator(n);
        this.setDenominator(d);
    }

    public double toDouble() {
        return (double)this.getNumerator() / this.getDenominator();
    }

    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    public void setNumerator(int n) {
        this.numerator = n;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
    }
}
