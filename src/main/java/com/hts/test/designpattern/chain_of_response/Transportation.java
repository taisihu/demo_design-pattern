package com.hts.test.designpattern.chain_of_response;

public abstract class Transportation {

    private static final int SHORT_DISTANT = 50;

    private static final int MIDDLE_DISTANT = 500;

    private static final int LONG_DISTANT = 1000;

    public int miles;
    public String name;

    protected Transportation nextTransportation;

    public void setNextTransportation(Transportation nextTransportation) {
        this.nextTransportation = nextTransportation;
    }

    public void packing(int miles,String name1){
        if(this.miles==miles){
            deliver();
        }else{
            nextTransportation.packing(miles,name1);
        }
    }

    public abstract void deliver();


}
