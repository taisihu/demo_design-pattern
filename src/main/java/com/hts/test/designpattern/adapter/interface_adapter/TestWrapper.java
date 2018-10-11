package com.hts.test.designpattern.adapter.interface_adapter;

public class TestWrapper {


    public static void main(String[] args) {

        SubSource1 subSource1 = new SubSource1();
        SubSource2 subSource2 = new SubSource2();

        subSource1.method1();
        subSource1.method2();
        subSource2.method1();
        subSource2.method2();

    }

}
