package com.klausschoeffmann.Strings;

public class Characters {
    public static void main(String[] args) {
        char[] emojis = {'\u266B', '\u26BD', '\u2639', '\u263A', '\u270C'};
        for (char c : emojis) {
            System.out.print(c);
        }

        String s = new String(emojis);
        System.out.println(s);
        char[] myArr = s.toCharArray();

        /*
        char c = 97;
        for (int i=0; i < 26; i++) {
            System.out.print( Character.toUpperCase(c++) );
        }*/

    }
}
