package com.company.c5.t16;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 15.09.2016.
 */
public class Task16 {
    public static void main(String[] args) {
        String[] s = new String[10];
        for (int i = 0; i < s.length; i ++) {
            s[i] = new String("qwe" + i);
        }
        print(Arrays.toString(s));
    }
}
