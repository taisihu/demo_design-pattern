package com.hts.test.designpattern.pattern.factory.mutiMethodFactory;

import com.hts.test.designpattern.pattern.factory.simple_factory.BreadMaker;

public class TestBreadFactory {

    public static void main(String[] args) {

        BreadFactory breadFactory = new BreadFactory();
        BreadMaker breadMaker = breadFactory.produceToast();
        breadMaker.make();

    }

}
