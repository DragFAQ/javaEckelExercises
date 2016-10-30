package com.company.c8.t17;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 17.10.2016.
 */
public class Task17 {
    public static void main(String[] args) {
        Task17 t1 = new Task17();
        t1.ride(new Unicycle());
        t1.ride(new Bicycle());
        t1.ride(new Tricycle());

        Cycle[] c = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };

        //c[0].balance();
        //c[1].balance();
        //c[2].balance();

        ((Unicycle)c[0]).balance();
        ((Bicycle)c[1]).balance();
        //((Tricycle)c[2]).balance();
    }

    private void ride(Cycle c) {
        print("123");
    }
}

class Cycle {
}

class Unicycle extends Cycle {
    public void balance() {
        print("Unicycle balanced");
    }
}

class Bicycle extends Cycle {
    public void balance() {
        print("Bicycle balanced");
    }
}

class Tricycle extends Cycle {

}