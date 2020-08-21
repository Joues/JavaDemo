package cn.ityihang.syntax;

import cn.ityihang.functionInterface.*;


/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/8/21 22:03
 */
public class BasicSyntax {
    public static void main(String[] args) {
//        1.实现无参，无返回值
        NoneReturnNoneParameter lambda1 = () -> {
            System.out.println("无参数，无返回值");
        };
        lambda1.test();

//        2.一个参数，无返回值
        NoneReturnSingleParameter lambda2 = (int a) -> {
            System.out.println("一个参数，无返回值，参数a:" + a);
        };
        lambda2.test(10);

//        3.多个参数，无返回值
        NoneReturnMutipleParameter lambda3 = (int a, int b) -> {
            System.out.println("多个参数，无返回值，参数a：" + a +"，b：" + b);
        };
        lambda3.test(10,20);

//        4.无参数，有返回值
        SingleReturnNoneParameter lambda4 = () -> {
            System.out.println("无参数，有返回值，返回值：" + 10);
            return 10;
        };
        int res = lambda4.test();
        System.out.println(res);

//        5.一个参数，有返回值
        SingleReturnSigleParameter lambda5 = (int a) -> {
            System.out.println("一个参数，有返回值，返回值" + a);
            return a;
        };
        int ress = lambda5.test(59);
        System.out.println(ress);

//        6.多个参数，有返回值
        SingleReturnMutipleParameter lambda6 = (int a,int b) -> {
            System.out.println("多个参数，有返回值,返回值a:"+a+",返回值b:"+b);
            return (a+b);
        };
        int resss = lambda6.test(10, 44);
        System.out.println(resss);

    }
}
