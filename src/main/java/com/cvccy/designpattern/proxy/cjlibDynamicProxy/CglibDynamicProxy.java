package com.cvccy.designpattern.proxy.cjlibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {

    private static Object target;

    public CglibDynamicProxy(Object target) {
        this.target = target;
    }

    public <T> T getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.print("Before ");
        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
