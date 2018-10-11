package com.hts.test.designpattern.basetest.enumtest;

public interface Food {

    enum Fruit implements Food{
        APPLE,
        Orange
    }

    enum Wine implements Food{
        WHITEWINE,
        BEER;
    }

}
