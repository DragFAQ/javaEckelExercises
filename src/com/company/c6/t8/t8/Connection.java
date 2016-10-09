package com.company.c6.t8.t8;

import java.util.Random;

/**
 * Created by drag on 16.09.2016.
 */
public class Connection {
    public int port;

    Connection () {
        port = new Random().nextInt(65535);
    }
}
