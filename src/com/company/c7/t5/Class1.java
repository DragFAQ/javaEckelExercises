package com.company.c7.t5;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 10.10.16.
 */
public class Class1 extends A {
    public static void main(String[] args) {
        Class1 c = new Class1();
    }

    B b;
}

class A {
    A() {
        print("A");
    }
}

class B {
    B() {
        print("B");
    }
}
