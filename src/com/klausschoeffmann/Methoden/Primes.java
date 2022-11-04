package com.klausschoeffmann.Methoden;

public class Primes {
    static String semester = "WS2022/23";

    public static void main(String[] args) {

        {
            int x = 10;
            x++;
            System.out.println(x);
        }

        semester = semester + " ---";
        System.out.println(semester);

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
