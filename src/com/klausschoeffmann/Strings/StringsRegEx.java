package com.klausschoeffmann.Strings;


import java.util.Scanner;

public class StringsRegEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.nextLine()).equals("exit")) {
            if (input.matches("(([3-6])+([c-f])+)+")) { //any number from 3-6 at least once, followed by any character from c-f at least once... and this sequence must occur once (or several times)
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
