package com.klausschoeffmann.Arrays;

import java.util.Scanner;

public class TicTacToe1 {

    public static void main(String[] args) {
        short[][] field = new short[3][3];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (playerTurn(scanner, field, 1))
                break;
            if (playerTurn(scanner, field, 2))
                break;
        }
    }

    private static boolean playerTurn(Scanner scanner, short[][] field, int playerNumber) {
        //ask player for position (repeat if position is invalid)
        boolean placedSuccessfully = true;
        do {
            if (!placedSuccessfully)
                System.out.println("Invalid input!");
            else
                printField(field);

            //get column(x) and row(y) from player
            System.out.println("Player " + playerNumber + ", please select position:");
            System.out.print("x=");
            short col = scanner.nextShort();
            System.out.print("y=");
            short row = scanner.nextShort();

            //try to place stone at position (if not possible, ask for new position)
            placedSuccessfully = placeStone(field, (short)playerNumber, col, row);
        } while (!placedSuccessfully);

        //check if player wins the game, or if game ended undecided?
        if (gameFinished(field, (short)playerNumber)) {
            System.out.println("Player " + playerNumber + " wins!");
            printField(field);
            return true;
        } else if (gameUndecided(field)) {
            printField(field);
            return true;
        } else {
            return false;
        }
    }

    private static boolean placeStone(short[][] f, short playerSign, short col, short row) {
        if (row < 1 || row > f.length /*3*/ ||
                col < 1 || col > f[0].length /*3*/)
            return false; //invalid position

        if (f[row-1][col-1] == 0) { //is cell empty?
            f[row-1][col-1] = playerSign;
            return true; //cell was empty
        } else {
            return false; //cell full
        }
    }

    private static void printField(short[][] f) {
        for (int y=0; y < f.length; y++) {
            for (int x=0; x < f[0].length; x++) {
                if (f[y][x] == 1)
                    System.out.print(" o ");
                else if (f[y][x] == 2)
                    System.out.print(" x ");
                else
                    System.out.print("   ");

                if (x < f[0].length-1)
                    System.out.print('|');
            }

            if (y < f.length-1)
                System.out.println("\n-----------");
            else
                System.out.println();
        }
    }

    private static boolean gameFinished(short[][] f, short playerSign) {
        if (f.length < 3 || f.length != f[0].length) {
            System.out.println("Game field corrupted!");
            System.exit(0);
        }

        //check horizontal lines
        for (int y=0; y < f.length; y++) {
            if (f[y][0] == playerSign && f[y][1] == playerSign && f[y][2] == playerSign)
                return true;
        }

        //check vertical lines
        for (int x=0; x < f[0].length; x++) {
            if (f[0][x] == playerSign && f[1][x] == playerSign && f[2][x] == playerSign)
                return true;
        }

        //check diagonal lines
        if (f[0][0] == playerSign && f[1][1] == playerSign && f[2][2] == playerSign ||
                f[2][0] == playerSign && f[1][1] == playerSign && f[0][2] == playerSign)
            return true;

        return false;
    }

    private static boolean gameUndecided(short[][] f) {
        for (short[] row : f) {
            for (short s : row) {
                if (s == 0)
                    return false;
            }
        }
        return true;
    }
}

