package com.hts.test.designpattern.strategy;

public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int[] dataArr = split(exp,"*");
        return dataArr[0] * dataArr[1];
    }
}
