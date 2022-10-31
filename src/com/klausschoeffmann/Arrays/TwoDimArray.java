package com.klausschoeffmann.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(a);

        for (int i=0; i < a.length; i++) { //i ist Zeilenindex
            for (int k=0; k < a[i].length; k++) { //k ist Spaltenindex
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }


    }
}
