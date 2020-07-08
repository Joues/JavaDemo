package com.yihang;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/7 22:22
 */
public class datatype {
    public static void main(String[] args) {

        int num0 = 1024;
        System.out.println("整型：" + 1024);//这就是一个整数，默认就是int类型
        System.out.println(3.14);//这就是一个浮点数，默认就是double类型

        //左边的long类型，右边是int类型，左右不一样
        long num1 = 100;
        System.out.println(num1);

        double num2 = 2.5F;
        float num3 =30L;
        System.out.println("浮点型：double:" + num2 + "; float:" + num3);//float类型是带小数点的

        boolean num4 = true;
        System.out.println("Boolean型：" + num4);
/*
当数据类型不一样时，将会发生数据类型转换;
自动类型转换(隐式)
    1.特点：代码不需要进行特殊处理，自动完成；
    2.规则：数据范围从小到大；
强制类型转换(显式)；
*/
    }
}
