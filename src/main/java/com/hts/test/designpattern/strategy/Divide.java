package com.hts.test.designpattern.strategy;

public class Divide extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int[] dataArr = split(exp,"/");
        return dataArr[0] / dataArr[1];
    }
}
