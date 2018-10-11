package com.hts.test.designpattern.pattern.factory_method;

public class CroissantMaker implements BreadMaker {
    @Override
    public void make() {
        System.out.println("make croissant");
    }
}
