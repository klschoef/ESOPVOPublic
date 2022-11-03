package com.klausschoeffmann.Methoden;

public class EinfacheMethoden {

    static void printHeader() {
        System.out.println("Artikelliste");
        System.out.println("------------");
    }

    static void printArticles() {
        printArticle(2, "Notizblock");
        printArticle(1, "Füllfeder");
        printArticle(5, "Bleistift");
        printArticle(1, "Radiergummi");
    }

    static void printArticle(int num, String name) {
        System.out.println(num + " mal " + name);
    }

    static void printFooter() {
        System.out.println("============");
    }

    public static void main(String[] args) {
        printHeader();
        printArticles();
        printFooter();
    }

}

