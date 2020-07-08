package com.yihang;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/7 23:07
 */
public class Characters {
    public static void main(String[] args) {

//        字符串比较
        String str1 = "Hello World";
        String anotherString = "hello world";
        Object objStr = str1;

        System.out.println( str1.compareTo(anotherString) );
        System.out.println( str1.compareToIgnoreCase(anotherString) );  //忽略大小写
        System.out.println( str1.compareTo(objStr.toString()));


//        字符串查找
        String strOrig1 = "Google Java Taobao";
        int intIndex = strOrig1.indexOf("Java");
        if(intIndex == - 1){
            System.out.println("没有找到字符串 Java");
        }else{
            System.out.println("Java 字符串位置 " + intIndex);
        }

//        查找字符串最后一次出现的位置
        String strOrig2 = "Hello world ,Hello Runoob";
        int lastIndex = strOrig2.lastIndexOf("Hello");
        if(lastIndex == - 1){
            System.out.println("没有找到字符串");
        }else{
            System.out.println("字符串最后出现的位置： "+ lastIndex);
        }


//        删除字符串中的一个字符
        String str2 = "this is Java";
        System.out.println(removeCharAt(str2, 3));


//        字符串替换
        String str="Hello World,Hello Java.";
        System.out.println(str.replace('H','W')); //替换全部
        System.out.println(str.replaceFirst("He","Wa")); //替换第一个遇到的
        System.out.println(str.replaceAll("He", "Ha")); //替换全部


//        字符串反转
        String str3="Hello Java.";
        String reverse = new StringBuffer(str3).reverse().toString();
        System.out.println("字符串反转前:"+str3);
        System.out.println("字符串反转后:"+reverse);


//        字符串分割
        String str4="www-baidu-com";
        String[] temp;
        String delimeter = "-";  //指定分隔符
        temp = str4.split(delimeter);  //分割字符串
        //普通for循环
        for(int i =0; i < temp.length; i++){
            System.out.println(temp[i]);
            System.out.println("");
        }

        System.out.println("----java for each循环输出的方法-----");
        String str5 = "www.baidu.com";
        String[] temp1;
        String delimeter1 = "\\.";   //指定分隔符，.号需要转义
        temp1 = str5.split(delimeter1);
        for (String x : temp1){
            System.out.println(x);
            System.out.println("");
        }


//        字符串小写转大写
        String str6 = "string runoob";
        String strUpper = str6.toUpperCase();
        System.out.println(strUpper);


//        测试两个字符串区域是否相等
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.
                regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.
                regionMatches(true, 11, second_str, 12, 9); //第一个参数 true 表示忽略大小写区别
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);


//        连接字符串
        long startTime = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            String result = "This is"
                    + "testing the"
                    + "difference"+ "between"
                    + "String"+ "and"+ "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接"
                + " - 使用 + 操作符 : "
                + (endTime - startTime)+ " ms");
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接"
                + " - 使用 StringBuffer : "
                + (endTime1 - startTime1)+ " ms");
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
