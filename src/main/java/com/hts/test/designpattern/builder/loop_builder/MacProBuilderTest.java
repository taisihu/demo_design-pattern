package com.hts.test.designpattern.builder.loop_builder;

public class MacProBuilderTest {

    public static void main(String[] args) {

        MacProBuilder macProBuilder = new MacProBuilder();
        Computer computer = macProBuilder.buildCPU("core i7").buildMainboard("jijia").build();
        System.out.println(computer);

    }

}
