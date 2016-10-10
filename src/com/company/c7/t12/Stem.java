package com.company.c7.t12;

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

    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();

        super.dispose();
    }

    public static void main(String[] args) {
        Stem s = new Stem();
        try {
            //
        } finally {
            s.dispose();
        }
    }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root() {
        print("Root");
    }

    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }
}

class Component1 {
    Component1() {
        print("Component1");
    }

    void dispose() {
        print("Component1 - dispose");
    }
}

class Component2 {
    Component2() {
        print("Component2");
    }

    void dispose() {
        print("Component2 - dispose");
    }
}

class Component3 {
    Component3() {
        print("Component3");
    }

    void dispose() {
        print("Component3 - dispose");
    }
}