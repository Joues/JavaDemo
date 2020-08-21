package com.yihang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/17 21:42
 */
public class Parent {
    public static void main(String[] args) throws Exception {
        //11111
        System.out.println("========11111==========");
        Person person1 = new Person();
        Class c1 = person1.getClass();

        Person person2 = new Person();
        Class c2 = person2.getClass();

        System.out.println(c1 == c2);

        //22222
        System.out.println("========22222==========");
        Class c3 = Person.class;
        System.out.println(c1 == c3);

        //33333
        System.out.println("========33333==========");
        Class c4 = Class.forName("com.yihang.Person");
        System.out.println(c1 == c4);
        Constructor co = c4.getConstructor(null);
        Object obj = co.newInstance(null);
        Method m = c4.getMethod("show", null);
        m.invoke(obj, null);
    }

}
