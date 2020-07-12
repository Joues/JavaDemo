package com.yihang;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/8 23:49
 */
public class Name {
    static int count = 0;
    static {
        count++;
        System.out.println("Name Class Loaded! count = [" + count + "]" );
    }

    public Name() {
        System.out.println("Name Constructor called!");
    }
}
