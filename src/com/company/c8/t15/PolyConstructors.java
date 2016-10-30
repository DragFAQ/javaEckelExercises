package com.company.c8.t15;

/**
 * Created by drag on 30.10.16.
 */

import static net.mindview.util.Print.*;

class Glyph {
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }

    void draw() {
        print("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int sideLength = 2;

    RectangularGlyph(int s) {
        sideLength = s;
        print("RectangularGlyph.RectangularGlyph(), side length = " + sideLength);
    }

    void draw() {
        print("RectangularGlyph.draw(), side length = " + sideLength);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(3);
    }
}