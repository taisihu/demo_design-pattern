package com.hts.test.designpattern.visitor;

public class MySubject1 implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "i am MySubject1";
    }
}
