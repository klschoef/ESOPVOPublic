package com.klausschoeffmann.Strings;

public class Strings2 {
    public static void main(String[] args) {
        /***************************************
         * Beispiele für die Verwendung von    *
         * Regular Expressions in Java.        *
         * hier nur für replace...() Methoden  *
         ***************************************/

        String str = "123 Dies ist ein einfacher String mit einem langen Wooooooooooooort. 456";

        System.out.println( str.replaceAll("..","a") );
        //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

        System.out.println( str.replaceFirst("\\.","!") );
        //123 Dies ist ein einfacher String mit einem langen Wort! 456

        System.out.println( str.replaceAll("o+","o") );
        //123 Dies ist ein einfacher String mit einem langen Wort. 456

        System.out.println( str.replaceAll("\\s?e","E") );
        //123 DiEs istEinEinfachEr String mitEinEm langEn Wooooooooooooort. 456

        System.out.println( str.replaceAll("o{6}","o") );
        //123 Dies ist ein einfacher String mit einem langen Wooort. 456

        System.out.println( str.replaceFirst("[0-9]","") );
        //23 Dies ist ein einfacher String mit einem langen Wooooooooooooort. 456

        System.out.println( str.replaceAll("[0-9]","") );
        // Dies ist ein einfacher String mit einem langen Wooooooooooooort.

        System.out.println( str.replaceAll("\\s","") );
        //123DiesisteineinfacherStringmiteinemlangenWooooooooooooort.456

        System.out.println( str.replaceAll("\\se[.[^\\s]]+", " e ") ); //GLEICH: "\\se[^\\s]+"
        //123 Dies ist e  e  String mit e  langen Wooooooooooooort. 456

        System.out.println( str.replaceAll("[aeiuo]", ".") );
        //123 D..s .st ..n ..nf.ch.r Str.ng m.t ..n.m l.ng.n W.............rt. 456

        System.out.println( str.replaceAll("[^o]", ".") );
        //....................................................ooooooooooooo.......

        System.out.println( str.replaceAll("[a-z&&[aeiou]]", "-") );
        //123 D--s -st --n --nf-ch-r Str-ng m-t --n-m l-ng-n W-------------rt. 456

        System.out.println( str.replaceAll("[a-z&&[^aeiou]]", "_") );
        //123 Die_ i__ ei_ ei__a__e_ S__i__ _i_ ei_e_ _a__e_ Wooooooooooooo__. 456

        System.out.println( str.replaceAll("[0-9]","").replaceFirst("^\\s","") );
        //123 Dies ist ein einfacher String mit einem langen Wooooooooooooort. 456
        //Dies ist ein einfacher String mit einem langen Wooooooooooooort.

    }
}
