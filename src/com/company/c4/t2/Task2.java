package com.company.c4.t2;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 08.09.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
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
