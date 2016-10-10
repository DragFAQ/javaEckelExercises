package com.company.c7.t11;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 10.10.16.
 */
public class Task11 {
    Detergent d = new Detergent();

    public static void main(String[] args) {
        Task11 t2 = new Task11();

        t2.scrub();
        t2.sterilize();
        print(t2);
    }

    public void scrub() {
        d.append(" Task2.scrub()");
        d.scrub();
    }

    public void sterilize() {
        d.append(" sterilize()");
    }

    public String toString() {
        return d.toString();
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
