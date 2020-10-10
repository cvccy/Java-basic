package com.cvccy.designpattern.proxy.pattern;

public class RealSubject implements Subject {

    @Override
    public void optation() {
        System.out.println("Progremming RealSubjecg [doSometing].");
    }
}
