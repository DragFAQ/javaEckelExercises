package com.company.c5.t18;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 15.09.2016.
 */
public class Task18 {
    public static void main(String[] args) {
        T18[] t = new T18[10];
        for (int i = 0; i < t.length; i ++) {
            t[i] = new T18("qwe" + i);
        }
    }
}

class T18 {
    T18 (String s) {
        print(s);
    }
}