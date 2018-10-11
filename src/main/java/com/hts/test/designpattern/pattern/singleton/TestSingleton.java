package com.hts.test.designpattern.pattern.singleton;

import com.hts.test.designpattern.pattern.singleton.EnumSingleton.SendUtil;

public class TestSingleton {

    public static void main(String[] args) {

//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        System.out.println(singleton1 == singleton2);

        SendUtil.send();

    }

}
