package com.hts.test.designpattern.pattern.factory_method;

public class ToastFactory implements Provider {
    @Override
    public BreadMaker produce() {
        return new ToastMaker();
    }
}
