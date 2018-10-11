package com.hts.test.generic.basetest;

public class TestGenClass {

    public static void main(String[] args) {

        GenClass<String> genClass1 = new GenClass<String>();
        genClass1.setData("s1");
        System.out.println(genClass1.getData());


        GenClass<Integer> genClass2 = new GenClass<Integer>();
        genClass2.setData(1);
        System.out.println(genClass2.getData());

    }

}
