package com.hts.test.designpattern.pattern.factory.simple_factory;

public class CroissantMaker implements BreadMaker {

    public void make() {
        System.out.println("生产羊角包");
    }
}
