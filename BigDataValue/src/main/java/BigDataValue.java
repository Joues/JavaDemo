import java.math.BigDecimal;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/8 22:28
 */
public class BigDataValue {
    public static void main(String[] args) {
        //创建BigDecimal，通过字符参数串创建
        BigDecimal number1= new BigDecimal("999999999999，99988888");
        //创建BigDecimal，通过double参数穿件
        BigDecimal  number2= new BigDecimal(567800000.8888888);

        //加法操作
        System.out.println("加法操作："+number1.add(number2));
        //减法操作
        System.out.println("减法操作："+number1.subtract(number2));
        //乘法操作
        System.out.println("乘法操作："+number1.multiply(number2));
        //除法操作
        System.out.println("除法操作："+number1.divide(number2,BigDecimal.ROUND_HALF_UP));
    }

}
