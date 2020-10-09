package com.cvccy.designpattern.proxy.pattern;

public class RealSubject implements Subject {

    @Override
    public void doWork() {
        System.out.println("Progremming RealSubjecg [doSometing].");
    }
}
