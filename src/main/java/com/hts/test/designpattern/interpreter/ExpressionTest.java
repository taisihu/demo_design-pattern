package com.hts.test.designpattern.interpreter;

public class ExpressionTest {

    //TODO 9+2-8

    public static void main(String[] args) {

        int result = new MinusExpression().interpret(new Context(new PlusExpression().interpret(new Context(9,2)),8));

        System.out.println("9+2-8="+result);

    }

}
