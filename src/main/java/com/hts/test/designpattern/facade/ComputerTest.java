package com.hts.test.designpattern.facade;

public class ComputerTest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.start();
        System.out.println("===============================");
        computer.shutdown();

    }

}
