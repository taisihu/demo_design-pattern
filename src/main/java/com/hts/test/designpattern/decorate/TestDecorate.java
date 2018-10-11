package com.hts.test.designpattern.decorate;

public class TestDecorate {

    public static void main(String[] args) {

        Source source = new Source();
        Decorate decorate = new Decorate(source);

        decorate.method();

    }

}
