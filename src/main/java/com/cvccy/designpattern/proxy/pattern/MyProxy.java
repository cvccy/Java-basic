package com.cvccy.designpattern.proxy.pattern;

public class MyProxy {

    private RealSubject subject = new RealSubject();

    public void optaion(){
        System.out.println("Preprocessor before targer method running.");
        subject.optation();
        System.out.println("Postprocessor after target method running.");
    }

}
