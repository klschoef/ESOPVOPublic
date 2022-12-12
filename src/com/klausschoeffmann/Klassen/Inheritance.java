package com.klausschoeffmann.Klassen;

public class Inheritance {
    void testMethod() {
        System.out.println(this.getClass());
    }

    public static void main(String[] args) {
        Inheritance inh = new Inheritance();
        inh.testMethod();

        if (inh instanceof Inheritance) {
            System.out.println("Ja, inh ist ein Objekt von Inheritance");
        }
    }
}
