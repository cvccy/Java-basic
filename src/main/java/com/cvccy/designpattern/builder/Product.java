package com.cvccy.designpattern.builder;

/**
 * @author xhf
 * @version V1.0
 * @date 2020/8/21 11:37 上午
 * @description 产品角色：包含多个组成部件的复杂对象。
 */
class Product
{
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA)
    {
        this.partA=partA;
    }
    public void setPartB(String partB)
    {
        this.partB=partB;
    }
    public void setPartC(String partC)
    {
        this.partC=partC;
    }
    public void show()
    {
        System.out.println("Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}');
    }

}
