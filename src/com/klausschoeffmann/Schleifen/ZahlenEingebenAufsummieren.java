package com.klausschoeffmann.Schleifen;

import java.util.Scanner;

public class ZahlenEingebenAufsummieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, number = 0;
        do {
            number = scanner.nextInt();
            sum += number;
        } while (sum <= 1000 && number != 0 && number < 10);

        System.out.println("Summe=" + sum);
    }
}
