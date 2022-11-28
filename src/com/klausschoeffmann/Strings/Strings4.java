package com.klausschoeffmann.Strings;

public class Strings4 {
    public static void main(String[] args) {
        String first = "Hello ", second = "World";
        String str1 = first.concat(second);
        String str2 = first + second;

        System.out.println(str1);
        System.out.println(str2);

        if (str1 == str2) {
            System.out.println("Gleiche Referenz!");
        } else {
            System.out.println("Unterschiedliche Referenz");
        }

        if (str1.equals(str2)) {
            System.out.println("Der Inhalt beider Strings ist gleich!");
        } else {
            System.out.println("Der Inhalt beider Strings ist unterschiedlich!");
        }
    }
}