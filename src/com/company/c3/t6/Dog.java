package com.company.c3.t6;

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
        Dog d3;

        d1.name = "spot";
        d2.name = "scruffy";
        d1.says = "Ruff!";
        d2.says = "Wurf!";
        d3 = d1;

        print(d3.equals(d1));
        print(d3.equals(d2));
        print(d1.equals(d2));
    }
}
