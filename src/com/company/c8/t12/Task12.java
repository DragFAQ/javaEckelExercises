package com.company.c8.t12;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 29.10.16.
 */
public class Task12 {
    public static void main(String[] args) {
        Rodent[] r = new Rodent[]{new Rat(), new Mouse(), new Mouse(), new Hamster()};

        for (Rodent i : r) {
            i.sayWantEat();
            i.sayWantSleep();
            print("---");
        }
    }
}

class Tail {
    Tail(String s) {
        print("Tail created for " + s);
    }
}

class Rodent {
    private Tail t = new Tail("Rodent");

    Rodent() {
        print("Rodent created");
    }

    public void sayWantEat() {
        print("Rodent want to eat!");
    }

    public void sayWantSleep() {
        print("Rodent want to sleep!");
    }
}

class Mouse extends Rodent {
    private Tail t = new Tail("Mouse");

    Mouse() {
        print("Mouse created");
    }

    @Override
    public void sayWantEat() {
        print("Mouse want to eat!");
    }

    @Override
    public void sayWantSleep() {
        print("Mouse want to sleep!");
    }
}

class Hamster extends Rodent {
    private Tail t = new Tail("Hamster");

    Hamster() {
        print("Hamster created");
    }

    @Override
    public void sayWantEat() {
        print("Hamster want to eat!");
    }

    @Override
    public void sayWantSleep() {
        print("Hamster want to sleep!");
    }
}

class Rat extends Rodent {
    private Tail t = new Tail("Rat");

    Rat() {
        print("Rat created");
    }

    @Override
    public void sayWantEat() {
        print("Rat want to eat!");
    }

    @Override
    public void sayWantSleep() {
        print("Rat want to sleep!");
    }
}