package com.hts.test.designpattern.pattern.factory.static_muti_method_factory;


import com.hts.test.designpattern.pattern.factory.simple_factory.BreadMaker;

public class TestBreadFactory {

    public static void main(String[] args) {

        BreadMaker breadMaker = BreadFactory.produceCroissantMaker();
        breadMaker.make();

    }

}
