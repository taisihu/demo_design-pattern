package com.hts.test.reflect.dynimic_proxy;

import java.lang.reflect.Proxy;

/**
 *
 * 通过调用Proxy静态方法Proxy.newProxyInstance()可以创建动态代理，
 * 这个方法需要得到一个类加载器，
 * 一个你希望该代理实现的接口列表(不是类或抽象类)，
 * 以及InvocationHandler的一个实现类。
 * 动态代理可以将所有调用重定向到调用处理器，
 * 因此通常会调用处理器的构造器传递一个”实际”对象的引用，
 * 从而将调用处理器在执行中介任务时，将请求转发
 *
 */
public class TestDynimicProxy {

    public static void main(String[] args) {

        DoImpl doImpl = new DoImpl();

        DoInterface doInterface = (DoInterface) Proxy.newProxyInstance(DoInterface.class.getClassLoader(), new Class[]{DoInterface.class}, new DynimicProxyHandler(doImpl));

        doInterface.dosomething();
        doInterface.dosomethingelse("ss");

    }

}
