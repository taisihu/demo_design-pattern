package com.hts.test.designpattern.flyweight;

import java.sql.Connection;

public class VectorTest {


    public static void main(String[] args) {

        ConnectionPool connectionPool = new ConnectionPool();
        connectionPool.initConnectionPool();

        Connection conn1 = connectionPool.getConnection();
        System.out.println("current pool size="+connectionPool.getPoolSize());
        Connection conn2 = connectionPool.getConnection();
        System.out.println("current pool size="+connectionPool.getPoolSize());

        System.out.println("conn1==conn2:"+ (conn1==conn2));

        connectionPool.release(conn1);
        System.out.println("current pool size="+connectionPool.getPoolSize());
        connectionPool.release(conn1);
        System.out.println("current pool size="+connectionPool.getPoolSize());


    }


}
