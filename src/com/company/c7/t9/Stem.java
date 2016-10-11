package com.company.c7.t9;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 10.10.16.
 */
public class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Stem() {
        print("Stem");
    }

    public static void main(String[] args) {
        Stem s = new Stem();
    }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root() {
        print("Root");
    }
}

class Component1 {
    Component1() {
        print("Component1");
    }
}

class Component2 {
    Component2() {
        print("Component2");
    }
}

class Component3 {
    Component3() {
        print("Component3");
    }
}