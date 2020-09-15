package com.msx.day01.demo01;

/**
 * @Author:msx
 * @Date:2020/9/11
 * @Description:com.msx.day01.demo01
 * @Version:1.0
 */
public class Demo01StaticMethod {
    public static void main(String[] args) {
        System.out.println(Test01Class.getAA());
        System.out.println(new Test01Class().getBB());
        System.out.println(new Test01Class().getAA());
    }
}
class Test01Class{
    private static int a = 10;
    private int b = 20;
    public static int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public static int getAA(){
        return getA();
    }
    public int getBB(){
        return getB();
    }
}
