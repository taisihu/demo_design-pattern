package com.hts.test.designpattern.strategy;

import org.springframework.util.StringUtils;

public abstract class AbstractCalculator {

    public int[] split(String exp,String opt){

        int[] dataArr = new int[2];

        String[] strArr = StringUtils.split(exp,opt);
        dataArr[0] = Integer.valueOf(strArr[0]);
        dataArr[1] = Integer.valueOf(strArr[1]);

        return dataArr;

    }

}
