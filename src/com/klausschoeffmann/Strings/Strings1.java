package com.klausschoeffmann.Strings;

public class Strings1 {
    public static void main(String[] args) {
        String first = "Hello ";
        String second = "World";
        String str1 = first.concat(second); //"Hello World"
        String str2 = first + second; //"Hello World"

        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);

        int firstO = str1.indexOf('o'); //4
        int lastO = str1.lastIndexOf('o'); //7

        System.out.println("Erster Index von 'o': " + firstO);
        System.out.println("Letzter Index von 'o': " + lastO);

        boolean startsWithHello = str1.startsWith("Hello"); //true
        boolean endsWithHello = str1.endsWith("Hello"); //false

        if (startsWithHello) {
            System.out.println("str1 beginnt mit \"Hello\"");
        }

        if (endsWithHello) {
            System.out.println("str1 endet mit \"Hello\"");
        }

        String oReplaced = str1.replace('o', '-'); //"Hell- W-rld"
        String subStr = str1.substring(7,10); //"orl" (char at endIndex not included!)

        System.out.println("'o' ersetzt durch '-': " + oReplaced);
        System.out.println("Substring from 7 to 10: " + subStr);

        String[] words = str1.split(" "); //words[0]: "Hello" words[1]: "World"
        System.out.println("Ergebnis von split(' '):");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("Vergleichen von str1 und str2:");

        if (str1 == str2) {
            System.out.println("str1 und str2 haben dieselbe Adresse/Referenz!");
        } else {
            System.out.println("str1 und str2 haben unterschiedliche Adressen/Referenzen!");
        }

        if (str1.equals(str2)) {
            System.out.println("Der Inhalt von str1 und str2 ist gleich!");
        } else {
            System.out.println("str1 und str2 haben unterschiedlichen Inhalt!");
        }

        String str3 = "Hello ESOP!";
        String str4 = "Hello ESOP!";

        if (str3 == str4) {
            System.out.println("str3 und str4 haben dieselbe Adresse/Referenz!");
        } else {
            System.out.println("str3 und str4 haben unterschiedliche Adressen/Referenzen!");
        }

        if (str3.equals(str4)) {
            System.out.println("Der Inhalt von str3 und str4 ist gleich!");
        } else {
            System.out.println("str3 und str4 haben unterschiedlichen Inhalt!");
        }
    }
}
