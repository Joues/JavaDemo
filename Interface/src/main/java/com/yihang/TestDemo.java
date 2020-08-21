package com.yihang;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/17 22:35
 */
public class TestDemo {

    static void tune(Rodents r) {
        r.play(10);
        r.eat();
        System.out.println("------------------");
    }
    static void tuneAll(Rodents[] R) {
        for (Rodents r : R) {
            tune(r);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rodents[] rodents = {
                new Mouses(),
                new Gerbils(),
                new SmallRed(),
                new BigBlack()
        };
        tuneAll(rodents);
    }
}