package com.klausschoeffmann.Klassen;

public class Person {
    String firstname = "";
    String lastname = "";
    boolean isStudent = false;

    public Person(String first, String lastname) {
        firstname = first;
        this.lastname = lastname;
        System.out.print("Aufruf beim Erzeugen von Person mit: ");
        this.printName();
    }

    public boolean equals(Person other) {
        return this.firstname.equals(other.firstname) && this.lastname.equals(other.lastname);
    }

    public void printName() {
        System.out.println(this.firstname + " " + this.lastname);
    }

    public String toString() {
        return this.firstname.substring(0,3) + ". " + this.lastname;
    }
}
