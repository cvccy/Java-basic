package com.cvccy.JavaLanguageBasic;

/**
 * @auther CVCCY
 * @data 2020.02.29
 * @discription 三目运算符中：第二个表达式和第三个表达式中如果都为基本数据类型，整个表达式的运算结果由容量高的决定。99.9 是 double 类型而9是 int 类型，double 容量高。
 */
public class Conditional {
    public static void main(String args[]){
        int x=4;
        System.out.println("value is "+((x>4)?99.9:9));
    }
}
