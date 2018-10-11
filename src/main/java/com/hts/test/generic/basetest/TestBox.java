package com.hts.test.generic.basetest;


/**
 *
 * 泛型这一概念提出的目的，
 * 导致其只是作用于代码编译阶段，
 * 在编译过程中，对于正确检验泛型结果后，
 * 会将泛型的相关信息擦出，也就是说，
 * 成功编译过后的class文件中是不包含任何泛型信息的。
 * 泛型信息不会进入到运行时阶段。
 *
 * 总结：泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型
 *
 */
public class TestBox {

    public static void main(String[] args) {

        /**
         *
         * 作用于代码编译阶段
         * 虽然类型参数不同，但只有一个class
         *
         * 在编译过程中，对于正确检验泛型结果后，会将泛型的相关信息擦除
         *
         */
        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);
        System.out.println("name class:" + name.getClass());      // com.qqyumidi.Box
        System.out.println("age class:" + age.getClass());        // com.qqyumidi.Box
        System.out.println(name.getClass() == age.getClass());    // true

        /**
         *
         *  泛型参数为父类和子类
         *
         *  但泛型没有继承关系
         *
         */

        Box<Number> num = new Box<Number>(123);
        Box<Integer> age1 = new Box<Integer>(5);

        getData(num);
        //报错，索命泛型参数之间没有继承关系
//        getData(age1);

        getUpperNumberData(num);
        getUpperNumberData(age1);

    }

    public static void getData(Box<Number> data){
        System.out.println("data :" + data.getData());
    }

    //类型实参必须是Number或者Number的子类
    public static void getUpperNumberData(Box<? extends Number> data){
        System.out.println("data :" + data.getData());
    }

}
