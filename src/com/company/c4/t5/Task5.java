package com.company.c4.t5;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 08.09.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        for (int i = 0; i < 32; i ++) {
            a = a == 1 ? 0 : 1;
            b = b == 1 ? 0 : 1;
            System.out.print(a & b);
        }
        System.out.print("\n");
        for (int i = 0; i < 32; i ++) {
            a = a == 1 ? 0 : 1;
            b = b == 1 ? 0 : 1;
            System.out.print(a | b);
        }
        System.out.print("\n");
        for (int i = 0; i < 32; i ++) {
            a = a == 1 ? 0 : 1;
            b = b == 1 ? 0 : 1;
            System.out.print(a ^ b);
        }
        System.out.print("\n");
        for (int i = 0; i < 32; i ++) {
            a = a == 1 ? 0 : 1;
            System.out.print(a);
        }
        System.out.print("\n");
        for (int i = 0; i < 32; i ++) {
            b = b == 1 ? 0 : 1;
            System.out.print(b);
        }
    }
}
