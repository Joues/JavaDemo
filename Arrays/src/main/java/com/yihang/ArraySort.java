package com.yihang;

import java.util.Arrays;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/8 23:46
 */
public class ArraySort {
    public static void main(String[] args) {
        //    12. 数组拷贝
        int[] hang = { 7, 8, 9, 41, 25 };
//        hang[3] = 28;
        System.out.println(hang);
        int[] copyhang = Arrays.copyOf(hang, hang.length);
        Arrays.sort(copyhang);
        System.out.println(copyhang);

        //        13. 数组排序
    }


}
