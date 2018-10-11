package com.hts.test.designpattern.pattern.factory.simple_factory;

public class TestSimpleFactory {

    public static void main(String[] args) {
        BreadMaker breadMaker = BreaderMakerFactory.produce("toast");
        breadMaker.make();
    }

}