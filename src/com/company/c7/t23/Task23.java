package com.company.c7.t23;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 16.10.2016.
 */
public class Task23 {
    public static void main(String[] args) {
//        T23.setI(5);
//        T23.setI(6);
        T23 t = new T23();
        T23 t1 = new T23();
    }
}

class T23 {
    static int i = setI(23);

    static int setI(int i) {
        T23.i = i;
        print(i);

        return i;
    }
}