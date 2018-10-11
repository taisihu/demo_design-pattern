package com.hts.test.generic.basetest.test_demo;

import org.springframework.util.CollectionUtils;

import java.util.List;

public class ArrayAlg {

    public static Pair<String> getMaxMin(List<String> list){

        if(CollectionUtils.isEmpty(list)){
            return null;
        }

        String min = list.get(0);

        String max = list.get(0);

        for(String t : list){
            if(min.compareTo(t)<0){
                min = t;
            }
            if(max.compareTo(t)>0){
                max = t;
            }
        }

        return new Pair<>(min,max);

    }

    public static <T> T getMiddle(T... arg){

        return arg[arg.length/2];

    }

}
