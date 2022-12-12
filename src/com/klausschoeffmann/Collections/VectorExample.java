package com.klausschoeffmann.Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("Hello");
        vec.add("World");

        for (String s : vec) {
            System.out.println(s);
        }
    }
}
