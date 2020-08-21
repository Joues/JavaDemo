package cn.ityihang.syntax;

import cn.ityihang.functionInterface.SingleReturnSigleParameter;

/**
 * 函数引用
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/8/21 22:53
 */
public class BasicPro {
    private static interface Calculate {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
//        SingleReturnSigleParameter lambda1 = (a) -> {
//            return a*a;
//        };
        SingleReturnSigleParameter lambda1 = a -> a*a;

//        Calculate calculate = BasicPro::Calculate;
        Calculate calculate = new BasicPro()::Calculate;

        System.out.println(calculate.calculate(10,23));

    }

    private int Calculate(int x , int y) {
        if (x > y) {
            return x-y;
        }
        return x+y;
    }

//    private static int Calculate(int x,int y) {
//        if (x > y) {
//            return x-y;
//        }else if (x < y) {
//            return y-x;
//        }
//        return x+y;
//    }
}
