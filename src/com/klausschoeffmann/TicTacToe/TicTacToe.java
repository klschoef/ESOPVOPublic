package com.klausschoeffmann.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static char[][] field = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public static void main(String[] args) {
        while (true) {
            playerTurn("Adam", 'x');
            if (foundMatch()) {
                System.out.println("Adam gewinnt!");
                break;
            }
            playerTurn("Eva", 'o');
            if (foundMatch()) {
                System.out.println("Eva gewinnt!");
                break;
            }
        }
    }

    static boolean foundMatch() {
        boolean retVal = false;

        if (field[1][1] != '_' &&
                (field[0][0] == field[1][1] && field[0][0] == field[2][2] ||
                field[0][2] == field[1][1] && field[0][2] == field[2][0]) )
            retVal = true;

        for (int r=0; r < field.length; r++) { //Annahme 3x3 Feld!
            if (field[r][0] != '_' && field[r][0] == field[r][1] && field[r][0] == field[r][2]) {//Zeilen-Match?
                retVal = true;
                break;
            }
            if (field[0][r] != '_' && field[0][r] == field[1][r] && field[0][r] == field[2][r]) { //Spalten-Match?
                retVal = true;
                break;
            }
        }

        if (retVal)
            printField();

        return retVal;
    }

    static void playerTurn(String name, char stone) {
        int row = -1, col = -1;
        do {
            printField();
            System.out.println(name + " wohin willst du deinen Stein legen?");
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Zeile=");
                row = scanner.nextInt();
            } while (row < 1 || row > 3);

            do {
                System.out.println("Spalte=");
                col = scanner.nextInt();
            } while (col < 1 || col > 3);
        }
        while (field[row-1][col-1] != '_');

        field[row-1][col-1] = stone;
    }

    static void printField() {
        for (char[] a : field) {
            for (char c : a) {
                System.out.print(c + " | ");
            }
            System.out.println();
        }
    }
}
