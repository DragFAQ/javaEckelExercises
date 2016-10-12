package com.company.c7.t17;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 12.10.16.
 */
public class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog f = new Frog();
        Amphibian a;
        ((Amphibian)f).showName("111");
        ((Amphibian)f).showText("222");
        f.showName("111");
        f.showText("222");
        a = f;
        a.showName("qqq");
    }

    void showName(String s) {
        print("Frog - " + s);
    }

    void showText(String s) {
        print("Frog - " + s);
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
/*
Frog - 111
Frog - 222
Frog - 111
Frog - 222
Frog - qqq
*/