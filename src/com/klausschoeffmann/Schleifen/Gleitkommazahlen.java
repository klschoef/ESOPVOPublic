package com.klausschoeffmann.Schleifen;

public class Gleitkommazahlen {
    public static void main(String[] args) {
        int n = 7;
        float sum1 = 0;
        for (int i=n; i > 0; i--) {
            sum1 += 1.f / i;
        }
        System.out.println("sum1 = " + sum1);

        sum1 = 0;
        for (int i=1; i <= n; i++) {
            sum1 += 1 / (float) i;
        }
        System.out.println("sum1 = " + sum1);

        double sum2 = 0;
        for (int i=n; i > 0; i--) {
            sum2 += 1 / (float) i;
        }
        System.out.println("sum2 = " + sum2);

        sum2 = 0;
        for (int i=1; i <= n; i++) {
            sum2 += 1 / (double) i;
        }
        System.out.println("sum2 = " + sum2);
    }
}
