package com.company.c2.t8;

/**
 * Created by drag on 05.09.2016.
 */
public class Test8 {
    static int k = 48;

    public static void main (String[] args) {
        Test8 t1 = new Test8();
        Test8 t2 = new Test8();

        t1.k = 54;
        t2.k = 66;

        System.out.println(t1.k);
        System.out.println(t2.k);
    }
}
