package com.hts.test.generic.basetest;

import java.util.List;

public class GenBeforeMethod<T> {

    /**
     *
     * 泛型方法在方法返回值前面有一个<T>声明，
     * 它的作用是告诉编译器编译的时候就识别它的类型，
     * 如果传入的T是A类型，那么你就不可以将B类型传入方法中去；
     *
     * <T extends List> : 泛型方法的类型参数只能写在描述符和返回值之间
     *
     * <T extends List>后面的T: 返回类型
     *
     * 定义泛型方法，其格式是：修饰符 <类型参数列表> 返回类型 方法名(形参列表) { 方法体 }
     *
     * @param list
     * @param <T>
     * @return
     */
    public <T extends Number> void getData(List<T> list){

        T var_1;

        for(T var : list){

            System.out.println(var);

        }

//        return var_1;
    }


}
