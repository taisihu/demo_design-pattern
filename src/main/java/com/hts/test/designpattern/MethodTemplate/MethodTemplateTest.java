package com.hts.test.designpattern.MethodTemplate;

public class MethodTemplateTest {

    //在抽象类父类定义方法执行顺序，子类重写父类方法，达到所有子类按照父类的方法模板执行（多态）
    public static void main(String[] args) {
        IDrive drive = new DriveBike();
        drive.dirve();
    }

}
