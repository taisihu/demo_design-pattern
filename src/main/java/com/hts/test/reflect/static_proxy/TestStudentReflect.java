package com.hts.test.reflect.static_proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestStudentReflect {

    public static void main(String[] args) {

        try {

            Class student = Class.forName("com.hts.test.reflect.static_proxy.Student");

            System.out.println("===========共有构造方法===========");
            Constructor[] constructors = student.getConstructors();
            for(Constructor constructor : constructors){
                System.out.println(constructor);
            }

            System.out.println("===========所有构造方法===========");
            Constructor[] declaredConstructors = student.getDeclaredConstructors();
            for(Constructor constructor : declaredConstructors){
                System.out.println(constructor);
            }

            System.out.println("=========有参数的公开构造方法");
            Constructor constructor = student.getConstructor(String.class,int.class);
            Object object = constructor.newInstance("lilei",20);

            System.out.println("===========对象属性值===========");
            Field[] declaredFields = student.getDeclaredFields();
            for(Field field : declaredFields){
                field.setAccessible(true);
                String name = field.getName();
                Object o = field.get(object);//what?为什么？？？
                System.out.println(name + "=" + o);
            }
            System.out.println("=======私有的构造方法=======");
            Constructor constructor1 = student.getDeclaredConstructor(String.class);

            Method[] methods = student.getDeclaredMethods();

            for(Method method : methods){

                String methodName = method.getName();
                if("showGrade".equals(methodName)){

                    method.setAccessible(true);
                    method.invoke(object,6);//必须要初始化(newInstance)才能调用

                }

            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
