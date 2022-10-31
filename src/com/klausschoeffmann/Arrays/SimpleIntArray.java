package com.klausschoeffmann.Arrays;

import java.util.Random;

public class SimpleIntArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60}; //new int[100];

        System.out.println(a);

        int[] b = a;
        System.out.println("b[" + 5 + "] = " + b[5]);
        System.out.println(b);

        /*Random rand = new Random();
        for (int i=0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }*/

        for (int i=0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }


    }
}
