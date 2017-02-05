package com.christer.thinkingInJava.initialization;

/**
 * @author linboaming
 * @create 2017-02-05 13:58
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            new Rock();
    }
}

class Rock {
    /**
     * 构造器的名称必须与类名完全相同，所以“每个方法首字母小写”的编码风格并不适用于构造器
     * 没有参数的构造器为默认构造器
     * 构造器没有返回值
     */
    Rock() {
        System.out.print("Rock ");
    }
}

/*
output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
 */