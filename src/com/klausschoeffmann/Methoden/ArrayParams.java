package com.klausschoeffmann.Methoden;

public class ArrayParams {
    public static void main(String[] args) {

        int x = 1;
        System.out.println("x = " + x);
        processVar(x); //call-by-value
        System.out.println("x = " + x);

        int[] a = {1, 2, 3, 4, 5};
        printArray(a);
        processArray(a); //Adresse wird kopiert (call-by-reference)
        System.out.println();
        printArray(a);
    }

    static void processVar(int x) {
        x += 20;
    }

    static void printArray(int[] b) {
        for (int val : b) {
            System.out.print(val + " ");
        }
    }

    static void processArray(int[] b) {
        b[2] = 10;
    }
}
