package com.company.c5.t12;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 11.09.2016.
 */
public class Task12 {
    public static void main(String[] args) {
        /*Tank t = new Tank();

        t.setValue(12);
*/
        new Tank();

        System.gc();
    }
}

class Tank {
    private int value;
    boolean isEmpty = false;

    public void setValue (int val) {
        value = val;
        isEmpty = value == 0;
    }

    public void finalize () {
        print("fin");
        if (!isEmpty)
            print("Error!");
    }
}