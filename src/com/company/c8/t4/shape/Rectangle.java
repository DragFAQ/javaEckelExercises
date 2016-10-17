package com.company.c8.t4.shape;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 18.10.2016.
 */
public class Rectangle extends Shape{
    @Override
    public void draw() {
        print("Rectangle.draw()");
    }

    @Override
    public void erase() {
        print("Rectangle.erase()");
    }
}
