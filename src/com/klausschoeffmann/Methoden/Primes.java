package com.klausschoeffmann.Methoden;

public class Primes {
    public static void main(String[] args) {
        for (int i=0; i <= 300; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ist eine Primzahl");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2 || n > 2 && n % 2 == 0)
            return false;

        for (int i=3; i < n; i+=2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
