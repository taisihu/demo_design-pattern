package com.hts.test.designpattern.decorate;

/**
 *
 * 和目标类实现相同接口
 * 然后进行装饰
 *
 */
public class Decorate implements Sourceable {

    private Source source;

    public Decorate(Source source) {
        this.source = source;
    }

    @Override
    public void method() {

        System.out.println("before source someting");
        source.method();
        System.out.println("behind source someting");

    }

}
