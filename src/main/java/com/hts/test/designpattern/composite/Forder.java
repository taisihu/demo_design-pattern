package com.hts.test.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Forder extends AbstractFile{

    private String name;

    public Forder(String name) {
        this.name = name;
    }

    List<AbstractFile> fileList = new ArrayList<AbstractFile>();

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");
        //递归调用成员构件的killVirus()方法
        for(Object obj : fileList) {
            ((AbstractFile)obj).killVirus();
        }
    }

    public void add(AbstractFile file){
        fileList.add(file);
    }

    public void remove(AbstractFile file){
        fileList.remove(file);
    }

    public AbstractFile getChild(int i){
        return fileList.get(i);
    }

}
