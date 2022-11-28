package com.klausschoeffmann.Strings;

public class Strings3 {
    public static void main(String[] args) {
        inefficientStringConcat();
        efficientStringConcat();
    }

    static void inefficientStringConcat() {
        long timeStart = System.currentTimeMillis();
        String str = "";
        for (int i=0; i < 10000; i++) {
            str = str + i + " ";
        }
        System.out.println(str);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time measurement: " + (timeEnd-timeStart) + "ms");
    }

    static void efficientStringConcat() {
        long timeStart = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < 10000; i++) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString());
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time measurement: " + (timeEnd-timeStart) + "ms");
    }
}
