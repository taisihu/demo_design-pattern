package com.hts.test.designpattern.visitor;

public interface Subject {

    void accept(Visitor visitor);

    String getSubject();

}
