package com.hts.test.designpattern.pattern.factory.simple_factory;

public class ToastMaker implements BreadMaker {

    public void make() {
        System.out.println("生产吐司");
    }

}
