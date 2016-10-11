package com.company.c7.t8;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 10.10.16.
 */
public class Task8 extends T8 {
    Task8() {
        super("qqq");
    }

    Task8(String s) {
        super(s);
    }

    public static void main(String[] args) {
        Task8 t = new Task8();
    }
}

class T8 {
    T8(String s) {
        print(s);
    }
}