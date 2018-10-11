package com.hts.test.designpattern.bridge;

public abstract class DriverBridge {

    private Driverable driverable;

    public void drive(){

        driverable.drive();

    }

    public Driverable getDriverable() {
        return driverable;
    }

    public void setDriverable(Driverable driverable) {
        this.driverable = driverable;
    }
}
