package com.company.c7.t20;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 16.10.2016.
 */
public class Task20 extends T20{
    public static void main(String[] args) {
        Task20 t = new Task20();
        t.method();
        T20 t2 = t;
        t2.method();
    }

    @Override
    void method() {
        print("Task20");
    }
}

class T20 {
    void method() {
        print("T20");
    }
}