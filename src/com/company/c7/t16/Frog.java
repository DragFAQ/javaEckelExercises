package com.company.c7.t16;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 12.10.16.
 */
public class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog f = new Frog();
        ((Amphibian)f).showName("111");
        ((Amphibian)f).showText("222");
    }
}

class Amphibian {
    void showName(String s) {
        print(s);
    }

    void showText(String s) {
        print(s);
    }
}