package com.christer.thinkingInJava.initialization;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * 定义数组也只是定义引用，不能指定大小，用{}括号可以初始化数组，
 * 可以将数组赋值给另一个数组，length为所有数组的固有成员
 * @author linboaming
 * @create 2017-02-07 0:37
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        a2 = a1;
        for(int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for(int i = 0; i < a1.length; i++)
            print("a1[" + i + "] = " + a1[i]);

        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];// 可以直接new数组，尽管不能用new创建单个基本类型数据，数组的创建是在运行时刻进行的
        print("length of a = " + a.length);
        print(Arrays.toString(a));
    }
}

/*
output:
a1[0] = 2
a1[1] = 3
a1[2] = 4
a1[3] = 5
a1[4] = 6
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 */