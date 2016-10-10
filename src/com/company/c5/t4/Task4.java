package com.company.c5.t4;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 11.09.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        T4 t = new T4();
        T4 t1 = new T4("www");
    }
}

class T4 {
    T4 () {
        print("qqq");
    }
    T4 (String str) {
        print(str);
    }
}