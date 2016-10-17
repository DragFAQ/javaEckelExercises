//: polymorphism/shape/Circle.java
package com.company.c8.t3.shape;

import static net.mindview.util.Print.*;

public class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public void prn() {
        print("Circle.prn()");
    }
}
