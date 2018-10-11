package com.hts.test.designpattern.builder.loop_builder;

public class MacProBuilder implements IComputerBuilder {

    private String cpu;

    private String mainboard;

    @Override
    public MacProBuilder buildCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public IComputerBuilder buildMainboard(String mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(cpu,mainboard);
    }
}
