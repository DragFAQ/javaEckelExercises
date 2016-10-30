package com.company.c8.t16;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 30.10.16.
 */

class Status {
    public void show() {}
}

class RedStatus extends Status {
    public void show() {
        print("Red status");
    }
}

class GreenStatus extends Status {
    public void show() {
        print("Green status");
    }
}

class AlertStatus {
    private Status status = new GreenStatus();

    public void change() {
        status = new RedStatus();
    }

    public void show() {
        status.show();
    }
}

public class Starship {
    public static void main(String[] args) {
        AlertStatus status = new AlertStatus();
        status.show();
        status.change();
        status.show();
    }
}
