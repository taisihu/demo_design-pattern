package com.hts.test.designpattern.pattern.factory_method;

public class ToastMaker implements BreadMaker {
    @Override
    public void make() {
        System.out.println("make toast");
    }
}
