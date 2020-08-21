package com.cvccy.designpattern.builder;

/**
 * @author xhf
 * @version V1.0
 * @date 2020/8/21 11:42 上午
 * @description 具体建造者：实现了抽象建造者接口。
 */
public class ConcreteBuilder extends Builder
{
    public void buildPartA()
    {
        product.setPartA("建造 PartA");
    }
    public void buildPartB()
    {
        product.setPartB("建造 PartB");
    }
    public void buildPartC()
    {
        product.setPartC("建造 PartC");
    }
}
