package com.klausschoeffmann.Schleifen;

import java.util.Scanner;

public class Sternchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        assert count > 0;

        for (int i=count; i > 0; i--) {
            System.out.print("*");
        }
        System.out.println();

    }
}
