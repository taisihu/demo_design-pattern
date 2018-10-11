package com.hts.test.reflect.dynimic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynimicProxyHandler implements InvocationHandler {

    private Object proxyed;

    public DynimicProxyHandler(Object proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理工作了...");
        return method.invoke(proxyed,args);
    }

}
