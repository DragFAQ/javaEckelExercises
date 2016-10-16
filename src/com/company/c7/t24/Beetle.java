package com.company.c7.t24;

/**
 * Created by Drag on 16.10.2016.
 */
//: reusing/Beetle.java
// The full process of initialization.
import static net.mindview.util.Print.*;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        print(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        print("Beetle constructor");
        Weaver w = new Weaver();
    }
}

class Weaver extends Beetle{
    private int l = printInit("Weaver.j initialized");
    public Weaver() {
        print("j = " + j);
        print("l = " + l);
    }
    private static int x3 = printInit("static Weaver.x3 initialized");
}