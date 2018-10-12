package com.hts.test.designpattern.memento;

public class MementoTest {

    public static void main(String[] args) {

        Original original = new Original("鼠标");

        Storage storage = new Storage(original.createMemento());

        System.out.println("original初始化value值："+original.getValue());
        original.setValue("键盘");
        System.out.println("original修改value值："+original.getValue());

        original.recoverValue(storage.getMemento());
        System.out.println("original恢复初始value值："+original.getValue());

    }

}
