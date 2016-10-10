package com.company.c3.t7;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 07.09.2016.
 */
public class Coin {
    public static void main(String[] args) {
        Random rand = new Random();
        int val = rand.nextInt(2) + 1;

        print(val);
    }
}
