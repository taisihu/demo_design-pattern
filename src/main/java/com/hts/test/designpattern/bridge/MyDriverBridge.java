package com.hts.test.designpattern.bridge;

public class MyDriverBridge extends DriverBridge {

    @Override
    public void drive() {
        super.getDriverable().drive();
    }

}
