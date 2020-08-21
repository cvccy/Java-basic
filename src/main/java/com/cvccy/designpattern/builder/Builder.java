package com.cvccy.designpattern.builder;

/**
 * @author xhf
 * @version V1.0
 * @date 2020/8/21 11:41 上午
 * @description 抽象建造者：包含创建产品各个子部件的抽象方法。
 */
abstract class Builder
{
    //创建产品对象
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult()
    {
        return product;
    }
}