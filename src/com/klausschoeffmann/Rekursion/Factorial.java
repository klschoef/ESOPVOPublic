package com.klausschoeffmann.Rekursion;

public class Factorial {
    public static void main(String[] args) {
        long result = factr(12);
        System.out.println(result);
    }

    static long factr(int n) {
        if (n <= 1) return 1; //Trivialfall
        else return factr(n-1) * n;
    }
}
