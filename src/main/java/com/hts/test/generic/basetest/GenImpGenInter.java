package com.hts.test.generic.basetest;

public class GenImpGenInter<T,T2> extends GenClass<T> implements GenInterface<T2>{

    private T var1;

    private T2 var2;

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public T2 getVar2() {
        return var2;
    }

    public void setVar2(T2 var2) {
        this.var2 = var2;
    }

    @Override
    public T getData() {
        return super.getData();
    }

    @Override
    public void setData(T data) {
        super.setData(data);
    }

    @Override
    public void show(T2 var3) {

    }
}
