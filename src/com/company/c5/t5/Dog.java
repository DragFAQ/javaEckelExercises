package com.company.c5.t5;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 11.09.2016.
 */
public class Dog {
    void bark (int a) {
        print(a);
    }
    void bark (char c) {
        print(c);
    }
    void bark (byte b) {
        print(b);
    }
    void bark (short s) {
        print(s);
    }
    void bark (long l) {
        print(l);
    }
    void bark (float f) {
        print(f);
    }
    void bark (double d) {
        print(d);
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.bark(1);
        d.bark('c');
        d.bark(2);
        d.bark(3L);
        d.bark(4);
        d.bark(5.5f);
        d.bark(6.6);
    }
}
