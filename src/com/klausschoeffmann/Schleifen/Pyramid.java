package com.klausschoeffmann.Schleifen;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        iterativeDivide();
    }

    static void printAsterisks() {
        System.out.println("Wie viele Sternchen?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for(int i = count; i > 0; --i) {
            System.out.print("*");
        }

        System.out.println();
    }

    static void readAndSumUpNumbers() {
        System.out.println("Zum Aufsummieren Zahlen eingeben (0 für Abbruch)");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean var2 = false;

        int number;
        do {
            number = scanner.nextInt();
            if (number != 0) {
                sum += number;
                System.out.println("\tZwischensumme=" + sum);
            }
        } while(sum < 1000 && number != 0);

        System.out.println("Summe=" + sum);
    }

    static void printPyramid() {
        System.out.println("Höhe der Pyramide?");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int update = 1;

        for(int i = 1; i <= rows && i > 0; i += update) {
            for(int k = 1; k <= i; ++k) {
                System.out.print('*');
            }

            System.out.println();
            if (i == rows) {
                update = -1;
            }
        }

    }

    static void iterativeDivide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Zahl soll iterativ dividiert werden?");
        double value = scanner.nextDouble();
        System.out.println(value);

        for(int i = 10; i >= 1; --i) {
            value /= 2.0D;
            System.out.println(value);
        }

    }
}
