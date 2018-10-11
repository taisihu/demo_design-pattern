package com.hts.test.designpattern.bridge;

public class MySqlDrive implements Driverable {

    @Override
    public void drive() {
        System.out.println("i am mysql drive");
    }

}
