package com.klausschoeffmann.Schleifen;

public class GGT {
    public static void main(String[] args) {
        int x = 132;
        int y = 99;

        for(int r = x % y; r != 0; r = x % r) {
            x = y;
            y = r;
        }

        System.out.println("ggt=" + y);
    }
}
