package com.hts.test.designpattern.interpreter;

public class MinusExpression implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
