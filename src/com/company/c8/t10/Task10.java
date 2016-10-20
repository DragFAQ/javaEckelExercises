package com.company.c8.t10;

import static net.mindview.util.Print.print;

/**
 * Created by Drag on 20.10.2016.
 */
public class Task10 {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        BasicClass b = c;
        b.method1();
    }
}

class BasicClass {
    public void method1() {
        print("BasicClass.method1");
        method2();
    }

    public void method2() {
        print("BasicClass.method2");
    }
}

class ChildClass extends BasicClass{
    @Override
    public void method2() {
        print("ChildClass.method2");
    }
}