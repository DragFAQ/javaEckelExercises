package com.company.c8.t14;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 29.10.16.
 */
public class Task14 {
    public static void main(String[] args) {
        ZooStore z = new ZooStore();
        Rodent[] r = new Rodent[]{new Rat(z), new Mouse(z), new Mouse(z), new Hamster(z)};

        for (Rodent i : r) {
            i.sayWantEat();
            i.sayWantSleep();
            i.dispose();
            print("---");
        }
    }
}

class ZooStore {
    private int refcount = 0;

    ZooStore() {
        print("Zoo store in Kyiv.");
    }

    public ZooStore getLink() {
        refcount++;
        return this;
    }

    public void delLink() {
        refcount--;
        if(refcount == 0) {
            print("Zoo store is empty.");
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
    private ZooStore store;

    Rodent(ZooStore z) {
        store = z.getLink();
        print("Rodent created");
    }

    public void sayWantEat() {
        print("Rodent want to eat!");
    }

    public void sayWantSleep() {
        print("Rodent want to sleep!");
    }

    protected void dispose() {
        print("Rodent sold");
        store.delLink();
    }
}

class Mouse extends Rodent {
    private Tail t = new Tail("Mouse");
    private ZooStore store;

    Mouse(ZooStore z) {
        super(z);
        store = z.getLink();
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

    protected void dispose() {
        print("Mouse sold");
        store.delLink();
        super.dispose();
    }
}

class Hamster extends Rodent {
    private Tail t = new Tail("Hamster");
    private ZooStore store;

    Hamster(ZooStore z) {
        super(z);
        store = z.getLink();
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

    protected void dispose() {
        print("Hamster sold");
        store.delLink();
        super.dispose();
    }
}

class Rat extends Rodent {
    private Tail t = new Tail("Rat");
    private ZooStore store;

    Rat(ZooStore z) {
        super(z);
        store = z.getLink();
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

    protected void dispose() {
        print("Rat sold");
        store.delLink();
        super.dispose();
    }
}