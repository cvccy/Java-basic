package com.cvccy.designpattern.builder;

/**
 * @author xhf
 * @version V1.0
 * @date 2020/8/21 11:44 上午
 * @description 客户类
 */
public class Client {
    public static void main(String[] args)
    {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();
    }
}
