package com.hts.test.generic.basetest.test_demo;

import java.util.ArrayList;
import java.util.List;

public class PareTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Mary");
        list.add("had");
        list.add("a");
        list.add("little");
        list.add("lamb");

        Pair<String> pair = ArrayAlg.getMaxMin(list);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        String[] strArr = new String[]{"a","b","c"};

        /**
         * 调用泛型方法，这个调用很奇怪。。。
         * 当调用一个泛型方法时,在方法名前的尖括号中放人具体的类型
         *
         * 方法调用中可以省略 <String> 类型参数:String middle = ArrayAlg.getHiddle(strArr);
         *
         */
        String s = ArrayAlg.<String>getMiddle(strArr);
        System.out.println(s);

    }

}
