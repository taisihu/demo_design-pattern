package com.hts.test.designpattern.prototype;

public class TestClone {

    public static void main(String[] args) {
        try {
            Prototype prototype = new Prototype();
            Prototype prototype1 = prototype.shallowClone();
            Prototype prototype2 = (Prototype) prototype.deepClone();

            boolean b = prototype.equals(prototype1);
            boolean b1 = prototype.equals(prototype2);
            System.out.println("shallowClone:prototype==prototype1=" + b);
            System.out.println("shallowClone:prototype==prototype2=" + b1);



        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
