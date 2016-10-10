package com.company.c5.t14;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 14.09.2016.
 */
public class Task14 {
    public static void main(String[] args) {
        T14.f();
    }
}

class T14 {
    static String q = "qwe";
    static String w;
    static {
        w = "ewq";
    }
    static void f() {
        print(q);
        print(w);
    }
}