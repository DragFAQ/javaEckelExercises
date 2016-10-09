package com.company.c3.t5;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 07.09.2016.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "spot";
        d2.name = "scruffy";
        d1.says = "Ruff!";
        d2.says = "Wurf!";

        print(d1.name + " says " + d1.says);
        print(d2.name + " says " + d2.says);
    }
}
