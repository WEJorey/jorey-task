package com.jorey.mytask.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {

    private Object object;

    public JDKDynamicProxy(Object object) {
        this.object = object;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do something before");
        Object o= method.invoke(object,args);
        return null;
    }
}
