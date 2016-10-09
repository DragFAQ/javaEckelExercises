package com.company.c5.t1;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 09.09.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        T1 t = new T1();

        if (t.s == null)
            print("null");
        else
            print(t.s);
    }
}

class T1 {
    public String s;
}