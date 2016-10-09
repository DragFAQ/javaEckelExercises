package com.company.c7.t1;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 09.10.2016.
 */
public class Task1 {
    private T1 t;

    public static void main(String[] args) {
        Task1 t1 = new Task1();

        print(t1);
    }

    public String toString() {
        if (t == null) {
            t = new T1();
        }

        return t.k;
    }
}

class T1 {
    String k = "123";

    T1() {
        print("T1 create");
    }
}