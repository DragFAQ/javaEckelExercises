package com.company.c4.t6;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 08.09.2016.
 */
public class IfElse2 {
    static boolean test(int testval, int begin, int end) {
        return testval >= begin && testval <= end ? true : false;
    }
    public static void main(String[] args) {
        print(test(10, 5, 15));
        print(test(5, 10, 15));
        print(test(5, 4, 5));
    }
}
