package com.hts.test.designpattern.MethodTemplate;

public class DriveCar extends IDrive {

    @Override
    void rolling() {
        System.out.println("4 while wheel rolling");
    }

    @Override
    void ready() {
        System.out.println("start engine...");
    }

}
