package com.hts.test.designpattern.pattern.factory_method;

public class TestFactoryMethod {

    public static void main(String[] args) {

        //不需要修改代码,直接创建实现类
        Provider provider = new ToastFactory();

        BreadMaker breadMaker = provider.produce();

        breadMaker.make();

    }

}
