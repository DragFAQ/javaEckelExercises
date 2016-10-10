package com.company.c6.t4;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 16.09.2016.
 */
public class Task4 {
    public static void main(String... args) {
        T4 t = new T4();
        t.prn("aaa");
    }
}

class T4 {
    protected void prn (String s) {
        print(s);
    }
}