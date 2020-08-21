package com.yihang;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/7/17 22:35
 */
class BigBlack extends Gerbils {
    public void play() {
        System.out.println(this + "PLAY()");
    }
    public void play(int n) {
        System.out.println(this + "PLAY(INT)");
    }
    public void eat() {
        System.out.println(this + "EAT()");
    }
}