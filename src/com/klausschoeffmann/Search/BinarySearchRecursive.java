package com.klausschoeffmann.Search;

public class BinarySearchRecursive {
    //Binäre Suche nach Element n im Array a (innerhalb der Indizes from bis to)
    static int binarySearchR(int[] a, int n, int from, int to) {
        System.out.print(".");
        if (from > to) return -1; //Suchbereich leer (Trivialfall 1)

        int m = (from + to) / 2;
        //System.out.println("Searching " + n + ": " + " from=" + from + " m=" + m + "(" + a[m] + ") to=" + to);

        if (n == a[m])
            return m; //gefunden (Trivialfall 2)
        else if (n < a[m])
            return binarySearchR(a, n, from, m-1);
        /*else*/
        return binarySearchR(a,n,m+1,to);
    }

    static void searchFor(int[] a, int elemToFind) {
        System.out.print("Element " + elemToFind + " wird gesucht ");
        int pos = binarySearchR(a, elemToFind, 0, a.length-1);
        if (pos == -1)
            System.out.println(" nicht gefunden!");
        else
            System.out.println(" gefunden an der Stelle " + pos);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,11,12,13,21,22,23,31,32,33,41,42,43,51,52,53};
        printArray(a);
        System.out.println("Binäre Suche mit Rekursion:");
        searchFor(a,23);
        searchFor(a,42);
        searchFor(a,20);
        searchFor(a,21);
        searchFor(a,1);
        searchFor(a,53);
        searchFor(a,11);
    }
}
