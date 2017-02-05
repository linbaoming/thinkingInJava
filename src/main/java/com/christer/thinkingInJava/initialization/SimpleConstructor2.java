package com.christer.thinkingInJava.initialization;

/**
 * @author linboaming
 * @create 2017-02-05 21:41
 */
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
            new Rock2(i);
    }
}

class Rock2 {
    /**
     * 有参构造器
     * 如果没有自定义构造器，则编译器会为类创建一个默认构造器
     * 如果有自定义任何构造器，则编译器便不再会为类创建默认构造器
     * @param i
     */
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

/*
output:
Rock 0 Rock 1 Rock 2 Rock 3 Rock 4 Rock 5 Rock 6 Rock 7
 */