//: polymorphism/shape/Square.java
package com.company.c8.t3.shape;

import static net.mindview.util.Print.*;

public class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }

    @Override
    public void prn() {
        print("Square.prn()");
    }
}
