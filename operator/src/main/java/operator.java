import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/7 22:51
 */
public class operator {
    public static void main(String[] args) {
        int a = 5;
        int b, c, d, f, g, h;
        b = +a; //正值
        System.out.println("b=" + b + ",a=" + a);
        c = -a; //负值
        System.out.println("c=" + c + ",a=" + a);
        int l = 2;
        d = ++l; //先l=l+1;再d=l
        System.out.println("d=" + d + ",l=" + l);
        int m = 3;
        f = m++;//先f=m;再m=m+1
        System.out.println("f=" + f + ",m=" + m);
        int n = 4;
        g = --n;//先n=n-1;再g=n
        System.out.println("g=" + g + ",n=" + n);
        int o = 6;
        h = o--;//先h=o;再o=o-1
        System.out.println("h=" + h + ",o=" + o);
        int p = 3;
        double q = 3.53;//或者3.53d
        float r = 1.7f;

//        除法
        System.out.println("int/int: p/q=" + p / q);
        System.out.println("double/int: q/p=" + q / p);
        System.out.println("float/int: r/p=" + r / p);

//        比较符
        System.out.println("9.5<8 :" + (9.5 < 8));
        System.out.println("8.5<=8.5:" + (8.5 <= 8.5));
        System.out.println("a~z：" + ((int) 'a') + "~" + ((int) 'z'));
        System.out.println("A~Z：" + ((int) 'A') + "~" + ((int) 'Z'));
        System.out.println("'A' < 'a':" + ('A' < 'a'));//字符'A'的Unicode编码值小于字符'a'

//        逻辑运算符
        System.out.println(1 << 3);
        System.out.println(8 >> 4);

        String[] sa = {"a", "b", "c", "d"};
        System.out.println(sa[2]);

//        三目运算符
        int u = 55, v = 132, res;
        res = u > v ? v : u;
        System.out.println(res);

//        强制類型轉換
        int w;
        double x = 5.66600;
        w = (int) x;
        System.out.println(w);

//        对象运算符instanceof
//        对象运算符instanceof用来测试一个指定对象是否是指定类（或它的子类）的实例，若是则返回true，否则返回false。
        String s = new String("sa");
        if (s instanceof Object) {
            System.out.println("String is object class");
        }


//        点运算符
//        点运算符"."的功能有两个：一是引用类中成员，二是指示包的层次等级
        String y = "i am string";
        y = y.substring(5);
        System.out.println(y);
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) it.next();
            System.out.println("key=" + me.getKey() + ",value=" + me.getValue());

        }
    }


//    boolean 类型变量的取值有：ture、false,1字节（8位）
//    char数据类型有：unicode字符,16位
//    byte：一个字节（8位）（-128~127）（-2的7次方到2的7次方-1）
//    short：两个字节（16位）（-32768~32767）（-2的15次方到2的15次方-1）
//    int：四个字节（32位）（一个字长）（-2147483648~2147483647）（-2的31次方到2的31次方-1）
//    long：八个字节（64位）（-9223372036854774808~9223372036854774807）（-2的63次方到2的63次方-1）
//    float：四个字节（32位）（3.402823e+38 ~ 1.401298e-45）（e+38是乘以10的38次方，e-45是乘以10的负45次方）
//    double：八个字节（64位）（1.797693e+308~ 4.9000000e-324）
}
