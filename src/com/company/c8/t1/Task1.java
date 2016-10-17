package com.company.c8.t1;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 17.10.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.ride(new Unicycle());
        t1.ride(new Bicycle());
        t1.ride(new Tricycle());
    }

    private void ride(Cycle c) {
        print("123");
    }
}

class Cycle {

}

class Unicycle extends Cycle {

}

class Bicycle extends Cycle {

}

class Tricycle extends Cycle {

}