package com.company.c6.t8.t8;

import java.util.Random;

/**
 * Created by drag on 16.09.2016.
 */
public class ConnectionManager {
    private ConnectionManager () {}
    private static Connection[] connections;
    private static int maxConnectionsCount;
    private static int connectionsCount;

    static {
        maxConnectionsCount = new Random().nextInt(20);
        connections = new Connection[maxConnectionsCount];
    }

    public static Connection getConnection () {
        Connection c = null;
        if (connectionsCount < maxConnectionsCount) {
            c = new Connection();
            connections[connectionsCount] = c;
            connectionsCount ++;
        }

        return c;
    }
}