package com.christer.thinkingInJava.initialization;

import static net.mindview.util.Print.*;

/**
 * 按参数顺序重载，最好不要这么做，会使代码不好维护
 * @author linboaming
 * @create 2017-02-05 23:24
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }
    static void f(int i, String s) {
        print("int: " + i + ", String: " + s);
    }
    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}

/*
output:
String: String first, int: 11
int: 99, String: Int first
 */