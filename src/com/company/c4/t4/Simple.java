package com.company.c4.t4;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 08.09.2016.
 */
public class Simple {
    public static void main(String[] args) {
        boolean flag;
        for (int i = 1; i < 100; i ++) {
            flag = false;
            for (int j = 2; j < i; j ++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                print(i);
            }
        }
    }
}
