package com.klausschoeffmann.Arrays;

import java.util.Scanner;

public class FibArray {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, ...
        // f_0 = 1, f_1 = 2, f_2 = 3, ....

        int f[] = new int[20];

        //Befüllen des Fib-Arrays
        f[0] = 1;
        f[1] = 1;

        for (int i=0; i < f.length; i++) {
            if (i >= 2) {
                f[i] = f[i - 1] + f[i - 2];
            }
            System.out.print(f[i] + ", ");
        }

        //Suche nach einem Wert
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nZu suchender Wert: ");
        int needle = scanner.nextInt();

        for (int k=0; k < f.length && needle >= f[k]; k++) {
            if (f[k] == needle) {
                System.out.println("Element an " + (k + 1) + ". Stelle gefunden.");
                break;
            }

        }
    }
}
