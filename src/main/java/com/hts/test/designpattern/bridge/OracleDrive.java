package com.hts.test.designpattern.bridge;

public class OracleDrive implements Driverable {

    @Override
    public void drive() {
        System.out.println("i am oracle dirve");
    }

}
