package com.company.c2.t7;

/**
 * Created by drag on 05.09.2016.
 */
public class Incrementable {
    static void increment() {
        StaticTest.i++;
    }

    public static void main (String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
    }
}
