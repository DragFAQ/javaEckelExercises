package com.company.c5.t22;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 15.09.2016.
 */
public class Task22 {
    public static void main(String... args) {
        for (Money m : Money.values()) {
            switch (m) {
                case UAH: print("a");
                    break;
                case USD: print("b");
                    break;
                case EUR: print("c");
                    break;
                default: print("o");
            }
            print(m + " 111 " + m.ordinal());
        }
    }
}

enum Money {
    UAH, USD, EUR, RUB, GBF, AUD
}