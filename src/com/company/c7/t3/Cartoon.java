package com.company.c7.t3;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 10.10.16.
 */
public class Cartoon extends Drawing {
    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing");
    }
}

class Art {
    Art() {
        print("Art");
    }
}