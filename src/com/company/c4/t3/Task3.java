package com.company.c4.t3;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 08.09.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        while (true) {
            Random rand = new Random();
            int a = rand.nextInt(25);
            int b = rand.nextInt(25);
            if (a < b) {
                print(a + " < " + b);
            } else if (a > b) {
                print(a + " > " + b);
            } else {
                print(a + " == " + b);
            }
        }
    }
}
