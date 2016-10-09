package com.company.c3.t11;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 07.09.2016.
 */
public class Bits {
    public static void main(String[] args) {
        int a = 0x80000000;

        print(Integer.toBinaryString(a >> 1));
        print(Integer.toBinaryString(a >> 2));
        print(Integer.toBinaryString(a >> 3));
        print(Integer.toBinaryString(a >> 4));
        print(Integer.toBinaryString(a >> 5));
        print(Integer.toBinaryString(a >> 6));
        print(Integer.toBinaryString(a >> 7));
        print(Integer.toBinaryString(a >> 8));
        print(Integer.toBinaryString(a >> 9));
        print(Integer.toBinaryString(a >> 10));

    }
}
