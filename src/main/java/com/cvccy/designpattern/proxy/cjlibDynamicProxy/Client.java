package com.cvccy.designpattern.proxy.cjlibDynamicProxy;

public class Client {
    public static void main(String[] args) {
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy(new Subject());
        Subject subject = cglibDynamicProxy.getProxy();
        subject.insert();
    }
}
