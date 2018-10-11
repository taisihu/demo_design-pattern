package com.hts.test.designpattern.observer.demo1;

public class ObserverTest {

    public static void main(String[] args) {

        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.notifyObservers();

    }

}
