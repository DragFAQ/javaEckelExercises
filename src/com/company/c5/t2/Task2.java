package com.company.c5.t2;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 09.09.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        T2 t = new T2();

        print(t.s);
        print(t.d);
    }
}

class T2 {
    public String s = "qqq";
    public String d;

    T2() {
        d = "www";
    }
}