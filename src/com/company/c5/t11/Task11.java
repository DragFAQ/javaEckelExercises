package com.company.c5.t11;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 11.09.2016.
 */
public class Task11 {
    public static void main(String[] args) {
        new T11();

        System.gc();
    }

}

class T11 {
    public void finalize () {
        print("fin");
    }
}