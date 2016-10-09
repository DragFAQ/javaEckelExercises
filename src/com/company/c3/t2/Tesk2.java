package com.company.c3.t2;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 06.09.2016.
 */
public class Tesk2 {
    float abc;

    public static void main(String[] args) {
        Tesk2 t1 = new Tesk2();
        Tesk2 t2 = new Tesk2();

        t1.abc = 5;
        t2.abc = 7;

        print(t1.abc);
        print(t2.abc);

        t1 = t2;

        print(t1.abc);
    }
}
