package com.company.c7.t18;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 12.10.16.
 */
public class Task18 {
    final int a1 = (new Random()).nextInt();
    static final int A_1 = (new Random()).nextInt();

    public static void main(String[] args) {
        Task18 t = new Task18();
        print(t.a1);
        print(t.A_1);
        Task18 t2 = new Task18();
        print(t2.a1);
        print(t2.A_1);
    }
}
