package com.klausschoeffmann.Arrays;

public class AnotherArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 0, 5};
        int[] b = {6, 7, 8};
        int[] c = {9, 10, 11, 12, 13};
        int[] d = new int[a.length];

        for (int i=0; i < a.length; i++) {
            d[i] = a[i];
        }

        System.out.println(b.length);
        b = a;
        a = c;
        System.out.println(b.length);

        System.out.println(a[2]);
        d = null;

        System.exit(0);


        b[3] = 4;

        for (int i=0; i < a.length; i++) {
            System.out.print(a[i] + " "); // 1 2 3 4 5
        }

        System.out.println();
        for (int i=0; i < b.length; i++) {
            System.out.print(b[i] + " "); // 1 2 3 4 5
        }

        }

}
