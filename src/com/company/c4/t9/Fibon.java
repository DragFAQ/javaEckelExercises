package com.company.c4.t9;

import net.mindview.util.CountingGenerator;

/**
 * Created by drag on 08.09.2016.
 */
public class Fibon {
    public static void main(String[] args) {
        int cnt = Integer.parseInt(args[0]);
        int prev = 0, preprev = 0;

        for (int i = 1; i <= cnt; i++) {
            switch (i) {
                case 1:
                case 2:
                    System.out.print("1, ");
                    prev = 1;
                    preprev = 1;
                    break;
                default:
                    int summ = preprev + prev;
                    System.out.print(summ + ", ");
                    preprev = prev;
                    prev = summ;
            }
        }
    }
}
