package com.company.c7.t7;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 10.10.16.
 */
public class Class1 extends A {
    B b;

    Class1() {
        super("qqq");
    }

    public static void main(String[] args) {
        Class1 c = new Class1();
    }

}

class A {
    A(String s) {
        print("A" + s);
    }
}

class B {
    B(String s) {
        print("B" + s);
    }
}
