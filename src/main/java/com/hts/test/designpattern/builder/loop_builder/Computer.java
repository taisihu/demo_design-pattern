package com.hts.test.designpattern.builder.loop_builder;

public class Computer {

    private String cpu;

    private String mainboard;

    public Computer(String cpu, String mainboard) {
        this.cpu = cpu;
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }
}
