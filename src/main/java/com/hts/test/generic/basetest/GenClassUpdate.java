package com.hts.test.generic.basetest;

import java.util.List;

public class GenClassUpdate {

    public <T> void add(List<T> list,T t){

        list.add(t);

    }

    public <T> void otherAdd(List<?> list,T str){

//        list.add(str);

    }

}
