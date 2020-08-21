package com.cvccy.designpattern.strategy;

/**
 * @author xhf
 * @version V1.0
 * @date 2020/8/20 7:52 下午
 * @description
 * 0、概述
 * 0.1、多种策略可供选择：
 *         乘飞机、乘火车、骑自行车、开私家车
 *         冒泡排序、选择排序、插入排序、二叉树排序
 * 0.2、如果使用多重条件转移语句实现（即硬编码），不但使条件语句变得很复杂，而且增加、删除或更换算法要修改原代码，不易维护，违背开闭原则。如果采用策略模式就能很好解决该问题。
 *
 * 1、策略模式（Strategy）
 *     策略（Strategy）模式的定义：该模式定义了一系列算法，
 *     并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 *     策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 * 2、策略模式的结构与实现
 *     > 准备一组算法，并将这组算法封装到一系列的策略类里面，作为一个抽象策略类的子类。
 *     > 重点在组织这些算法，从而让程序结构更加灵活，具有更好的维护性和扩展性。
 *
 */
public class StrategyPattern
{
    public static void main(String[] args)
    {
        Context c=new Context();
        Strategy s=new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s=new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}

/**
 * 3 模式结构
 */
//抽象策略类：定义了一个公共的接口，不同的算法一不同的方式实现这个接口，环境角色使用这个接口调用不同的算法
interface Strategy
{
    public void strategyMethod();    //策略方法
}
//具体策略类A：实现了抽象策略定义的接口，提供具体的算法实现。
class ConcreteStrategyA implements Strategy
{
    public void strategyMethod()
    {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
//具体策略类B：实现了抽象策略定义的接口，提供具体的算法实现。
class ConcreteStrategyB implements Strategy
{
    public void strategyMethod()
    {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
//环境类：持有一个策略类的引用，最终给客户端调用。
class Context
{
    private Strategy strategy;
    public Strategy getStrategy()
    {
        return strategy;
    }
    public void setStrategy(Strategy strategy)
    {
        this.strategy=strategy;
    }
    public void strategyMethod()
    {
        strategy.strategyMethod();
    }
}

