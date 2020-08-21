package com.yihang;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/17 21:57
 */
public class RunDog {
    public static void main(String[] args) {
        ParentDog pDog;
        SonDog sDogA, sDogB;
        pDog = new ParentDog("Jack");
        System.out.println("pDog = new ParentDog(\"Jack\"):");
        System.out.println("pDog的名字是："+pDog.dogName+"\n");

        sDogA = new SonDog("JackA");
        sDogB = new SonDog("JackB");
        pDog = sDogA;
        System.out.println("pDog = sDogA:");
        System.out.println("pDog的名字是："+pDog.dogName);
        System.out.println("sDogA的名字是："+sDogA.dogName);
        System.out.println("sDogB的名字是："+sDogB.dogName+"\n");

        pDog = sDogB;
        System.out.println("pDog = sDogB:");
        System.out.println("pDog的名字是："+pDog.dogName);
        System.out.println("sDogA的名字是："+sDogA.dogName);
        System.out.println("sDogB的名字是："+sDogB.dogName);
    }
}