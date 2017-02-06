package com.christer.thinkingInJava.initialization;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * @author linboaming
 * @create 2017-02-07 0:47
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("length of a = " + a.length);
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); // Autoboxing
        print(Arrays.toString(a));

        // 用{}初始化对象数组
        Integer[] a1 = {
                new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };
        Integer[] b1 = new Integer[]{
                new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));
    }
}

/*
output:
length of a = 18
[55, 193, 361, 461, 429, 368, 200, 22, 207, 288, 128, 51, 89, 309, 278, 498, 361, 20]
[1, 2, 3]
[1, 2, 3]
 */
