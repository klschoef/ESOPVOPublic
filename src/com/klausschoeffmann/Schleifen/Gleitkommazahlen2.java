package com.klausschoeffmann.Schleifen;

public class Gleitkommazahlen2 {
    public static void main(String[] args) {
        double result = 4.7 % 1.2;
        System.out.println(result);

        if (Math.abs(result - 1.1) < 0.0000001) {
            //if (result == 1.1) {
            System.out.println("YESS!");
        }
    }
}
