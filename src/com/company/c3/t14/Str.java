package com.company.c3.t14;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 08.09.2016.
 */
public class Str {
    public static void main(String[] args) {
        String a = new String("fff");
        String b = new String("fff");
        compare("qqq", "www");
        compare("aaa", "aaa");
        print(a == b);
    }

    public static void compare (String a, String b) {
        print(a == b);
        print(a != b);
        print(a.equals(b));
        print(!a.equals(b));
    }
}
