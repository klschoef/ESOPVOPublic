package com.klausschoeffmann.Search;

public class BinarySearchIterative {
    static int binarySearch(int[] arr, int n) {
        int from = 0;
        int to = arr.length - 1;
        int pos = -1;

        System.out.print("Element " + n + " wird gesucht ");

        while (from <= to) {
            System.out.print(".");
            int m = (from + to) / 2;
            if (n == arr[m]) {
                System.out.println(" gefunden an der Stelle " + m);
                pos = m;
                break;
            }
            if (n < arr[m]) {
                to = m - 1;
            } else {
                from = m + 1;
            }
        }
        if (pos == -1) {
            System.out.println(" nicht gefunden!");
        }
        return pos;
    }

    static void printArray(int[] arr) {
        System.out.print(arr.length + " elements: [");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,11,12,13,21,22,23,31,32,33,41,42,43,51,52,53};
        printArray(a);
        System.out.println("Binäre Suche mit Schleifen (iterativ):");
        binarySearch(a,23);
        binarySearch(a,42);
        binarySearch(a,20);
        binarySearch(a,21);
        binarySearch(a,1);
        binarySearch(a,53);
        binarySearch(a,11);
        System.out.println("Lineare Suche zum Vergleich:");
        LinearSearch.lookFor(a,23);
        LinearSearch.lookFor(a,42);
        LinearSearch.lookFor(a,20);
        LinearSearch.lookFor(a,21);
        LinearSearch.lookFor(a,1);
        LinearSearch.lookFor(a,53);
        LinearSearch.lookFor(a,11);
    }
}
