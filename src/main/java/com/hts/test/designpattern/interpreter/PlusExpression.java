package com.hts.test.designpattern.interpreter;

public class PlusExpression implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
