package com.klausschoeffmann.Search;

public class SelectionSort {
    public static void main(String[] args) {
        //int[] arr = {7,3,19,15,13,11,17,5};
        int[] arr = {3, 1, 7, 4, 9, 5, 10, 6};
        printArray(arr);
        sort(arr);
        System.out.println();
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void sort(int[] arr) {
        int N = arr.length;
        for (int i=0; i < N; i++) {
            int min = i;
            for (int j=i+1; j < N; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            elemSwap(arr,i,min);
        }
    }

    static void elemSwap(int[] arr, int i, int j) {
        System.out.print(" " + arr[i] + "<->" + arr[j]);
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
