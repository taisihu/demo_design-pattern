package com.hts.test.designpattern.commond;

public class CommondTest {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Commond commond = new MyCommond(receiver);
        Invoke invoke = new Invoke(commond);
        invoke.action();

    }

}
