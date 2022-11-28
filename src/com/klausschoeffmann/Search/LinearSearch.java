package com.klausschoeffmann.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {7,3,19,15,13,11,17,5};
        printArray(arr);
        lookFor(arr, 3);
        lookFor(arr, 5);
    }

    static void lookFor(int[] arr, int elem) {
        System.out.print("Looking for " + elem + " in this array: ");
        //printArray(arr);
        int idx = linearSearch(arr, elem);
        if (idx == -1)
            System.out.println("\tCould not find the element!");
        else
            System.out.println("\tElement found at position " + idx);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int linearSearch(int[] arr, int elem) {
        int idx = -1;

        for (int i=0; i < arr.length; i++) {
            System.out.print(".");
            if (arr[i] == elem) {
                idx = i; //return i;
                break;
            }
        }
        return idx; //-1;
    }
}
