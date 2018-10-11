package com.hts.test.designpattern.composite;

public class ImageFile extends AbstractFile {

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("****对图片文件'" + name + "'进行杀毒");
    }
}
