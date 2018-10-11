package com.hts.test.reflect.static_proxy;

public class Base {

    private static int num;

    static{
        num = 1;
    }

    public int getNum(){
        return num;
    }

}
