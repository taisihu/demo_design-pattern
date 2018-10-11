package com.hts.test.reflect.static_proxy;

public class Student {

    private String name;

    private  int age;

    Student(){
        System.out.println("(默认)的构造方法 name = " + name);
    }

    //私有构造方法
    private Student(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }
    //私有构造方法
    private Student(String name){
        System.out.println("私有的构造方法   姓名："+ name);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("公用的构造方法 name = " + name +"  年龄："+ age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("设置name="+name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("age="+age);
    }

    private void showGrade(int gradelevel){
        System.out.println("正在上"+gradelevel+"年级");
    }
}
