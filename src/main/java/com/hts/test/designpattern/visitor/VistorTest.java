package com.hts.test.designpattern.visitor;

public class VistorTest {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        Subject subject1 = new MySubject1();

        //访问这访问不同的对象，获取不同对象里的操作
        subject.accept(visitor);
        subject1.accept(visitor);


    }

}
