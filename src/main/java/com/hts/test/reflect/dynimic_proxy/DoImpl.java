package com.hts.test.reflect.dynimic_proxy;

public class DoImpl implements DoInterface {

    @Override
    public void dosomething() {
        System.out.println("this is dosomething()...");
    }

    @Override
    public void dosomethingelse(String str) {
        System.out.println("this is dosomethingelse()..." + str);
    }
}
