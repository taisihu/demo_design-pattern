package com.hts.test.generic.basetest;

import java.util.ArrayList;
import java.util.List;

public class TestGenBeforeMethod {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        GenBeforeMethod genBeforeMethod = new GenBeforeMethod();
        genBeforeMethod.getData(list);

    }

}
