package com.hts.test.designpattern.pattern.factory_method;

public class CroissantFactory implements Provider {
    @Override
    public BreadMaker produce() {
        return new CroissantMaker();
    }
}
