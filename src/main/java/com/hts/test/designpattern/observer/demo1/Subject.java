package com.hts.test.designpattern.observer.demo1;

public interface Subject<T> {

    void add(T t);

    void remove(T t);

    void operate();

    void notifyObservers();

}
