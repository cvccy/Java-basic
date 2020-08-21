package com.cvccy.designpattern.builder;

/**
 * @author xhf
 * @version V1.0
 * @date 2020/8/21 11:43 上午
 * @description 指挥者：调用建造者中的方法完成复杂对象的创建。
 */
public class Director {

    private Builder builder;
    public Director(Builder builder)
    {
        this.builder=builder;
    }
    //产品构建与组装方法
    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }

}
