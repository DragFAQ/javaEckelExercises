package com.company.c5.t19;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 15.09.2016.
 */
public class Task19 {
    public static void main(String[] args) {
        someMethod ("1", "2", "3");
        someMethod((String[])new String[]{"2", "1", "0"});
    }

    private static void someMethod (String... vars) {
        print(Arrays.toString(vars));
    }
}
