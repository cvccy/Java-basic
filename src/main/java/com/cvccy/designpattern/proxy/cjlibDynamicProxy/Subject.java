package com.cvccy.designpattern.proxy.cjlibDynamicProxy;

public class Subject {

    public void insert(){
        System.out.println("insert");
        select();
    }

    public void select(){
        System.out.println("select");
    }

    public void delete(){
        System.out.println("delete");
    }

    public void updata(){
        System.out.println("updata");
    }
}
