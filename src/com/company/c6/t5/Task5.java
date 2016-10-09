package com.company.c6.t5;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 16.09.2016.
 */
public class Task5 {
    public static void main(String... args) {
        T5 t = new T5();
        print(t.i1);
//        print(t.i2);
        print(t.i3);
        print(t.i4);
    }
}

class T5 {
    public int i1;
    private int i2;
    protected int i3;
    int i4;
}