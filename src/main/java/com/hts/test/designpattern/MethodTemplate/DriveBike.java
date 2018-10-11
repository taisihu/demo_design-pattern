package com.hts.test.designpattern.MethodTemplate;

public class DriveBike extends IDrive {

    @Override
    void rolling() {
        System.out.println("2 wheel rolling");
    }

    @Override
    void ready() {
        System.out.println("pull out bike...");
    }
}
