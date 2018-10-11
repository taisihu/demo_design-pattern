package com.hts.test.designpattern.adapter.wrapper_adapter;

public class WrapperTest {

    public static void main(String[] args) {

        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);

        wrapper.method1();
        wrapper.method2();

    }

}
