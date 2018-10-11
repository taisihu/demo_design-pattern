package com.hts.test.designpattern.adapter.class_adapter;

/**
 * 类的适配器模式
 * 适配，使Targetable具有Source的功能
 *
 */
public class Adapter extends  Source implements Targetable {

    @Override
    public void method1() {
        super.method1();
    }

    @Override
    public void method2() {
        System.out.println("Targetable.method2()");
    }
}
