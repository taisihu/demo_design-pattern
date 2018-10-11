package com.hts.test.designpattern.pattern.singleton;

public class Singleton {

    private Singleton(){}

    public void say(){
        System.out.println("i am singletom");
    }

    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }


}
