package com.cvccy.designpattern.proxy.jdkproxy;

import com.cvccy.designpattern.proxy.pattern.RealSubject;
import com.cvccy.designpattern.proxy.pattern.Subject;

public class Client {
    public static void main(String[] args) {
        Subject subject = new JdkDynamicProxy(new RealSubject()).getProxy();
        subject.optation();
    }
}
