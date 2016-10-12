package com.company.c7.t19;

/**
 * Created by drag on 12.10.16.
 */
public class Task19 {
    final int i;

    public static void main(String[] args) {
        Task19 t = new Task19();
        Task19 t1 = new Task19(3);
        //t.i = 4;
        //t1.i = 3;
    }

    Task19() {
        i = 5;
    }

    Task19(int i) {
        this.i = i;
    }
}
