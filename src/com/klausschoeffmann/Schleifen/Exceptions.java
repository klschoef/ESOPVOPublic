package com.klausschoeffmann.Schleifen;

public class Exceptions {
    public static void main(String[] args) {
        float x = 1;
        try {
            x /= 0;
            System.out.println("ende vom try-Block");
        }
        catch (ArithmeticException ae) {
            System.out.println("Arithmetic exception - " + ae.getMessage());
        }
        catch (Exception e) {
            System.out.println("Allgemeine Exception");
        }
        finally {
            System.out.println("finally !");
        }
        System.out.println(x);
    }
}
