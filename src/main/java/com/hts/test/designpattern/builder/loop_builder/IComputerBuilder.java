package com.hts.test.designpattern.builder.loop_builder;

public interface IComputerBuilder {

    IComputerBuilder buildCPU(String cpu);

    IComputerBuilder buildMainboard(String mainboard);

    Computer build();

}
