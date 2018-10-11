package com.hts.test.designpattern.observer.demo1;

public class MySubject extends AbstractSubject {

    @Override
    public void operate() {
        System.out.println("update self!");
        notifyObservers();
    }

}
