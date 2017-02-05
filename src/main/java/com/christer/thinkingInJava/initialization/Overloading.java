package com.christer.thinkingInJava.initialization;

import static net.mindview.util.Print.*;
/**
 * java区分重载方法：通过参数类型列表而不是返回值
 * 返回值之所以不可以，是因为如果调用此方法时忽略返回值（即只是调用方法，不对返回值做任何操作），则不知道实际应调用哪个方法
 * @author linboaming
 * @create 2017-02-05 23:13
 */
public class Overloading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}

class Tree {
    int height;

    /**
     * 重载构造函数
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }

    /**
     * 重载普通方法
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}

/*
output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
 */