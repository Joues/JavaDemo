package com.yihang;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/17 22:34
 */
class Gerbils implements Rodents {

    @Override
    public void play(int n) {
        // TODO Auto-generated method stub
        System.out.println(this + "PLAY()" + n);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println(this + "EAT()");
    }
}