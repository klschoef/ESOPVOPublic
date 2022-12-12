package com.klausschoeffmann.Klassen;



public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Adam", "Müller");
        Person p2 = new Person("Eva", "Moser");
        Person p3 = new Person("John", "Abc");
        p1.printName();
        p2.printName();

        //if (p1.firstname.equals(p2.firstname) && p1.lastname.equals(p2.lastname)) {
        //if (p2.equals(p1)) {
        if (p1.equals(p3)) {
            System.out.println("Gleich");
        } else {
            System.out.println("Ungleich");
        }

        System.out.println(p1);
        System.out.println(p2);

        String beideNamen = "" + p1 + " " + p2;
        System.out.println(beideNamen);

    }
}
