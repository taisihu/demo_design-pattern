package com.hts.test.designpattern.commond;

public class MyCommond implements Commond {

    private Receiver receiver;

    public MyCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
