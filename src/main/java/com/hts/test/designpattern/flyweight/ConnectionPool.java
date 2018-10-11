package com.hts.test.designpattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

    private String jdbc_driverClassName="com.mysql.jdbc.Driver";
    private String jdbc_url="jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&allowMultiQueries=true";
    private String jdbc_username="root";
    private String jdbc_password="abc#123";
    private int poolSize = 20;

    //共享池
    private Vector<Connection> pool;


    public void initConnectionPool(){

        pool = new Vector<Connection>(poolSize);
        try {
            for(int i=0;i<poolSize;i++){
                Class.forName(jdbc_driverClassName);
                Connection conn = DriverManager.getConnection(jdbc_url,jdbc_username,jdbc_password);
                pool.add(conn);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public synchronized  Connection getConnection(){
        if(pool.size()>0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }
        return null;
    }

    public synchronized  boolean release(Connection conn){
        return pool.add(conn);
    }

    public int getPoolSize(){
        return pool.size();
    }

}
