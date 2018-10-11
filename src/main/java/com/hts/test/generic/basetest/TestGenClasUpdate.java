package com.hts.test.generic.basetest;

import java.util.ArrayList;
import java.util.List;

public class TestGenClasUpdate {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("s1");
        list.add("s2");

        GenClassUpdate genClassUpdate = new GenClassUpdate();

        genClassUpdate.add(list,"S3");



        genClassUpdate.otherAdd(list,"s4");

    }

}
