import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/8 22:28
 */
public class BigDataValue {
    public static void main(String[] args) {

//        1. BigInteger (大的整数)  实现了任意精度的整数运算
        //创建BigInteger，字符串表示10进制数值
        BigInteger number1= new BigInteger("999999999999");
        //创建BigInteger，字符串表示16进制数值
        BigInteger  number2= new BigInteger("567800000",16);

        //加法操作
        System.out.println("加法操作："+number1.add(number2));
        //减法操作
        System.out.println("减法操作："+number1.subtract(number2));
        //乘法操作
        System.out.println("乘法操作："+number1.multiply(number2));
        //除法操作
        System.out.println("除法操作："+number1.divide(number2));
        System.out.println("============================================");


//        2. BigDecimal   任意精度的浮点数运算
        //创建BigDecimal，通过字符参数串创建
        BigDecimal number3= new BigDecimal("99999999999999988888");
        //创建BigDecimal，通过double参数穿件
        BigDecimal  number4= new BigDecimal(567800000.8888888);

        //加法操作
        System.out.println("加法操作："+number3.add(number4));
        //减法操作
        System.out.println("减法操作："+number3.subtract(number4));
        //乘法操作
        System.out.println("乘法操作："+number3.multiply(number4));
        //除法操作
        System.out.println("除法操作："+number3.divide(number4,BigDecimal.ROUND_HALF_UP));
    }

}
