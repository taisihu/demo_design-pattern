package com.hts.test.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

//策略模式
public class StrategyTest {

//    Map<String,ICalculator> calculatorMap = new HashMap<String,ICalculator>();

    public static void main(String[] args) {

        StrategyTest strategyTest = new StrategyTest();

        String exp = "20/3";
        strategyTest.calc(exp);

    }

    public void calc(String exp){

        ICalculator calculator = null;

        if(exp.contains("+")){
            calculator = new Plus();
        }
        if(exp.contains("-")){
            calculator = new Minus();
        }
        if(exp.contains("*")){
            calculator = new Multiply();
        }
        if(exp.contains("/")){
            calculator = new Divide();
        }

        int result = calculator.calculate(exp);
        System.out.println(result);

    }


}
