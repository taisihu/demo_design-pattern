package com.hts.test.designpattern.chain_of_response;

public class ChainTest {

    public static void main(String[] args) {

        Transportation drive = new Vehicle(50,"手机");
        Transportation train = new Train(500,"平板");
        Transportation flight = new Flight(1000,"咖啡");

        drive.setNextTransportation(train);
        train.setNextTransportation(flight);

        drive.packing(1000,"苹果手机");

    }

}
