package com.company.c8.t9;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 20.10.2016.
 */
public class Task9 {
    public static void main(String[] args) {
        Rodent[] r = new Rodent[]{new Rat(), new Mouse(), new Mouse(), new Hamster()};

        for (Rodent i : r) {
            i.sayWantEat();
            i.sayWantSleep();
            print("---");
        }
    }
}

class Rodent {
    public void sayWantEat() {
        print("Rodent want to eat!");
    }

    public void sayWantSleep() {
        print("Rodent want to sleep!");
    }
}

class Mouse extends Rodent {
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
    @Override
    public void sayWantEat() {
        print("Rat want to eat!");
    }

    @Override
    public void sayWantSleep() {
        print("Rat want to sleep!");
    }
}