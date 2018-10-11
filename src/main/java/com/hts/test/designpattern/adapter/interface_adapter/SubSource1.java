package com.hts.test.designpattern.adapter.interface_adapter;

public class SubSource1 extends Wrapper {

    @Override
    public void method1() {
        System.out.println("Targetable interface's method1");
    }
}
