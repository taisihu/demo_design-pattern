package com.hts.test.designpattern.pattern.singleton.EnumSingleton;

public enum SendUtil {

    INSTANCE;

    public static void send(){
        System.out.println("send email...");
    }

}
