package com.company.c3.t10;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 07.09.2016.
 */
public class Bits {
    public static void main(String[] args) {
        int a = 0xaaaaaaaa;
        int b = 0x55555555;

        print(Integer.toBinaryString(a & b));
        print(Integer.toBinaryString(a | b));
        print(Integer.toBinaryString(a ^ b));
        print(Integer.toBinaryString(~ a));
        print(Integer.toBinaryString(~ b));
    }
}
