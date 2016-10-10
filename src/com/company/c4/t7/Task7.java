package com.company.c4.t7;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 08.09.2016.
 */
public class Task7 {
    public static void main(String[] args) {
        int i = 1;
        for (;;) {
            print(i);
            if (i == 99) {
                return;
            }
            i++;
        }
    }
}
