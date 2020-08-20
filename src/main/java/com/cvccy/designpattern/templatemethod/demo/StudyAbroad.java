package com.cvccy.designpattern.templatemethod.demo;

/**
 * @author xhf
 * @version V1.0
 * @date 2020/8/20 7:11 下午
 * @description 出国留学的抽象类 StudyAbroad，里面包含了一个模板方法 TemplateMethod()，
 *              该方法中包含了办理出国留学手续流程中的各个基本方法
 */
abstract class StudyAbroad {

    /**
     * 模版方法
     */
    public void TemplateMethod() //模板方法
    {
        LookingForSchool(); //索取学校资料
        ApplyForEnrol();    //入学申请
        ApplyForPassport(); //办理因私出国护照、出境卡和公证
        ApplyForVisa();     //申请签证
        ReadyGoAbroad();    //体检、订机票、准备行装
        Arriving();         //抵达
    }

    private void ApplyForPassport()
    {
        System.out.println("三.办理因私出国护照、出境卡和公证：");
        System.out.println("  1）持录取通知书、本人户口簿或身份证向户口所在地公安机关申请办理因私出国护照和出境卡。");
        System.out.println("  2）办理出生公证书，学历、学位和成绩公证，经历证书，亲属关系公证，经济担保公证。");
    }
    private void ApplyForVisa()
    {
        System.out.println("四.申请签证：");
        System.out.println("  1）准备申请国外境签证所需的各种资料，包括个人学历、成绩单、工作经历的证明；个人及家庭收入、资金和财产证明；家庭成员的关系证明等；");
        System.out.println("  2）向拟留学国家驻华使(领)馆申请入境签证。申请时需按要求填写有关表格，递交必需的证明材料，缴纳签证。有的国家(比如美国、英国、加拿大等)在申请签证时会要求申请人前往使(领)馆进行面试。");
    }
    private void ReadyGoAbroad()
    {
        System.out.println("五.体检、订机票、准备行装：");
        System.out.println("  1）进行身体检查、免疫检查和接种传染病疫苗；");
        System.out.println("  2）确定机票时间、航班和转机地点。");
    }
    public abstract void LookingForSchool();//索取学校资料
    public abstract void ApplyForEnrol();   //入学申请
    public abstract void Arriving();        //抵达


}
