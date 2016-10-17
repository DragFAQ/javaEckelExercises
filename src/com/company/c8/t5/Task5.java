package com.company.c8.t5;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 18.10.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        Task5 t1 = new Task5();
        t1.ride(new Unicycle());
        t1.ride(new Bicycle());
        t1.ride(new Tricycle());
    }

    private void ride(Cycle c) {
        print(c.wheels());
    }
}

class Cycle {
    public int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    @Override
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    public int wheels() {
        return 3;
    }
}