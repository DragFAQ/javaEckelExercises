package com.company.c3.t3;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 06.09.2016.
 */
public class Task3 {
    float abc;

    static void f(Task3 t) {
        t.abc = 2;
    }

    public static void main(String[] args) {
        Task3 t1 = new Task3();

        t1.abc = 5;
        print(t1.abc);
        f(t1);
        print(t1.abc);
    }
}
