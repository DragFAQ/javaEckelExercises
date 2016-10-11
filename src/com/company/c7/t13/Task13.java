package com.company.c7.t13;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 11.10.2016.
 */
public class Task13 extends T13{
    public static void main(String[] args) {
        Task13 t = new Task13();

        t.some('c');
        t.some(5.4f);
        t.some("qqq");
        t.some(111);
    }

    void some(char c) {
        print("char");
    }
}

class T13 {
    void some(int i) {
        print("int");
    }

    void some(String s) {
        print("String");
    }

    void some(float f) {
        print("float");
    }
}