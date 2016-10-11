package com.company.c7.t10;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 10.10.16.
 */
public class Stem extends Root {
    Component1 c1 = new Component1("c1");
    Component2 c2 = new Component2("c2");
    Component3 c3 = new Component3("c3");

    Stem() {
        super("qqq");
        print("Stem");
    }

    public static void main(String[] args) {
        Stem s = new Stem();
    }
}

class Root {
    Component1 c1 = new Component1("c1");
    Component2 c2 = new Component2("c2");
    Component3 c3 = new Component3("c3");

    Root(String s) {
        print("Root" + s);
    }
}

class Component1 {
    Component1(String s) {
        print("Component1" + s);
    }
}

class Component2 {
    Component2(String s) {
        print("Component2" + s);
    }
}

class Component3 {
    Component3(String s) {
        print("Component3" + s);
    }
}