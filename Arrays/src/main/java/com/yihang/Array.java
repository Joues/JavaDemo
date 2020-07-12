package com.yihang;

import com.sun.deploy.util.StringUtils;


import java.util.*;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/8 23:13
 */
public class Array {

    public static void main(String[] args) {
        //    1. 打印数组中的数据
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);
// print directly will print reference value
        System.out.println(intArray); // [I@7150bd4d
        System.out.println(intArrayString); // [1, 2, 3, 4, 5]

//        2. 从Array中创建ArrayList
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);  // [a, b, c, d, e]

//        3. 检查数组中是否包含某一个值
        String[] stringArray1 = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArray1).contains("a");
        System.out.println(b); // true


//        4. 连接两个数组
        int[] intArray2 = { 1, 2, 3, 4, 5 };
        int[] intArray3 = { 6, 7, 8, 9, 10 };
// Apache Commons L
//        int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);


//        5. 将数组中的元素以字符串的形式输出
        String j = StringUtils.join(Arrays.asList(new String[]{"a", "b", "c"}), ", ");
        System.out.println(j);


//        6. 将Array转化成Set集合
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println(set); //[d, e, b, c, a]


//        7. 数组翻转
        int[] intArray4 = { 1, 2, 3, 4, 5 };
//        ArrayUtils.reverse(intArray4);
//        System.out.println(Arrays.toString(intArray4));  //[5, 4, 3, 2, 1]

//        8. 从数组中移除一个元素
        int[] intArray5 = { 1, 2, 3, 4, 5 };
//        int[] removed = ArrayUtils.removeElement(intArray5, 3);//create a new array
//        System.out.println(Arrays.toString(removed));


//        9. foreach循环
        int[] a = {1,2,3,4,5};
        for (int element : a) {
            System.out.println(element);
        }


//        10. 数组初始化
        int[] yi = {1,2,3,4,5,6};
        System.out.println(yi);
//        11. 匿名数组
        yi = new int[]{1,2,3,4,5,6};
        System.out.println(yi);

//        new yihang[0];  创建一个长度为0的数组


//

    }

}
