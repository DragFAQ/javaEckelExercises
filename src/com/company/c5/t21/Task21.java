package com.company.c5.t21;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 15.09.2016.
 */
public class Task21 {
    public static void main(String... args) {
        for (Money m : Money.values()) {
            print(m + " 111 " + m.ordinal());
        }
    }
}

enum Money {
    UAH, USD, EUR, RUB, GBF, AUD
}