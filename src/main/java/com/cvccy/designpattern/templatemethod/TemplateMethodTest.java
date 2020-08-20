package com.cvccy.designpattern.templatemethod;

/**
 * 模版模式：定义一个算法操作的骨架，而将一些步骤延迟到子类中实现。
 * 作用：子类可以不改变一个算法的结构即可重新定义算法的某些特定步骤。
 * 优点：封装不变，拓展可变部分；开闭原则
 * 实现：
 *      1. 抽象类与子类之间的协作
 *      2. 虚函数
 *      3. 反向控制
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass abstractClass=new SubClass1();
        abstractClass.operation();
    }
}


//模版结构的实现

/**
 * 1、抽象类；给出算法的轮廓和骨架；1模版方法+n基本方法
 */
abstract class AbstractClass{

    /**
     * 1.1、模版方法：定义了算法的骨架，按照某种顺序调用其包含的基本方法
     */
    public void operation(){
        // open
        System.out.println(" pre ... ");

        System.out.println(" step1 ");

        System.out.println(" step2 ");

        templateMethod();
        // ....
    }

    /**
     * 1.2、基本方法：整个算法中的一个步骤
     * > 抽象方法：抽象类中申明，有具体子类实现。
     * > 具体方法：在抽象类中已经实现，在具体类中可以继承和重写；
     * > 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
     */
    abstract protected  void  templateMethod();

}

/**
 * 2、具体子类Concrete Class：实现抽象类中定义的抽象方法和勾子方法，它们是一个顶级逻辑的一个组成部分。
 */
class SubClass extends AbstractClass{

    @Override
    protected void templateMethod() {
        System.out.println("SubClass executed .  ");
    }
}

class SubClass1 extends AbstractClass{

    @Override
    protected void templateMethod() {
        System.out.println("SubClass1 executed .  ");
    }
}

/**
 * 模板方法模式通常适用于以下场景。
 * 1. 算法的整体步骤很固定，但其中个别部分易变时，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现。
 * 2. 当多个子类存在公共的行为时，可以将其提取出来并集中到一个公共父类中以避免代码重复。首先，要识别现有代码中的不同之处，并且将不同之处分离为新的操作。最后，用一个调用这些新的操作的模板方法来替换这些不同的代码。
 * 3. 当需要控制子类的扩展时，模板方法只在特定点调用钩子操作，这样就只允许在这些点进行扩展。
 */