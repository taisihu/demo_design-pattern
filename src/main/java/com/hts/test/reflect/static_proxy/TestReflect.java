package com.hts.test.reflect.static_proxy;

public class TestReflect {

    public static void main(String[] args) {

        Class clazz1 = Base.class;

        Class clazz2 = null;

        try {
            clazz2 = Class.forName("com.hts.test.reflect.static_proxy.Base");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(clazz1 == clazz2);

//        Method[] methods = clazz1.getMethods();
//        Field[] declaredFields = clazz1.getDeclaredFields();

//        for(Field field : declaredFields){
//            field.setAccessible(true);
//            System.out.println(field.getName());
//            System.out.println(field.isAccessible());
//            System.out.println(field.getInt());
//        }

//        for(Method method : methods){
//            method.invoke()
//        }

    }


}
