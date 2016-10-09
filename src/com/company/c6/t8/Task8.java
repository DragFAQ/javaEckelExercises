package com.company.c6.t8;

import com.company.c6.t8.t8.*;

import static net.mindview.util.Print.print;

/**
 * Created by drag on 16.09.2016.
 */
public class Task8 {
    public static void main(String[] args) {
        Connection c;

        print("start");
        do {
            c  = ConnectionManager.getConnection();
            if (c != null) {
                print("Connection port = " + c.port);
            }
        } while (c != null);
        print("end");
    }
}