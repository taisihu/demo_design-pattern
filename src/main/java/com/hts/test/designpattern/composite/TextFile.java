package com.hts.test.designpattern.composite;

public class TextFile extends AbstractFile {

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("****对文本文件'" + name + "'进行杀毒");
    }

}
