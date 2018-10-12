package com.hts.test.designpattern.chain_of_response;

public class Vehicle extends Transportation{

    public Vehicle(int miles,String name) {
        this.miles = miles;
        this.name = name;
    }

    @Override
    public void setNextTransportation(Transportation nextTransportation) {
        super.setNextTransportation(nextTransportation);
    }

    @Override
    public void deliver() {
        System.out.println("用货车---->运输:货物名称："+name+",里程数："+miles);
    }
}
