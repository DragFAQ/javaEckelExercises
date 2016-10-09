package com.company.c7.t2;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 09.10.2016.
 */
public class Task2 extends Detergent {
    public static void main(String[] args) {
        Task2 t2 = new Task2();

        t2.scrub();
        t2.sterilize();
        print(t2);
    }

    public void scrub() {
        append(" Task2.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }
}

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}

class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}
