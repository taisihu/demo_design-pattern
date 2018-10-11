package com.hts.test.designpattern.MethodTemplate;

public abstract class IDrive {

    public void dirve(){
        ready();
        rolling();
        arrive();
    }

    abstract void rolling();

    abstract void ready();

    public void arrive(){

        System.out.println("i am arrive");

    }

}
