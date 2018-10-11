package com.hts.test.designpattern.observer.demo1;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject<Observer>{

    Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer t) {
        vector.add(t);
    }

    @Override
    public void remove(Observer t) {
        vector.remove(t);
    }

    @Override
    public void notifyObservers() {

        Enumeration<Observer> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            enumeration.nextElement().update();
        }
    }
}
